package com.kodilla.backendkantor.mapper;

import com.kodilla.backendkantor.domain.ActionType;
import com.kodilla.backendkantor.domain.ActionTypeDto;
import com.kodilla.backendkantor.domain.UserActivity;
import com.kodilla.backendkantor.domain.UserActivityDto;
import com.kodilla.backendkantor.exception.ActionNotFoundException;
import com.kodilla.backendkantor.exception.UserNotFoundException;
import com.kodilla.backendkantor.repository.ActionTypeRepository;
import com.kodilla.backendkantor.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserActivityMapper {
    @Autowired
    UserRepository userRepository;
    @Autowired
    ActionTypeRepository actionTypeRepository;
    public UserActivityDto mapToUserActivityDto(final UserActivity userActivity) {
        return new UserActivityDto( userActivity.getCreated(),userActivity.getUser().getId(),userActivity.getActivityId());
    }
    public UserActivity mapToUserActivity(final UserActivityDto userActivityDto) throws UserNotFoundException, ActionNotFoundException {
        UserActivity userActivity = new UserActivity();
        userActivity.setCreated(userActivityDto.getCreated());
        userActivity.setUser(userRepository.findById(userActivityDto.getUserId()).orElseThrow(UserNotFoundException::new));
        userActivity.setActionType(actionTypeRepository.findById(userActivityDto.getActionId()).orElseThrow(ActionNotFoundException::new));
        return userActivity;
    }
}
