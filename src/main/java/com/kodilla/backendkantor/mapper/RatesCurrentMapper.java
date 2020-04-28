package com.kodilla.backendkantor.mapper;

import com.kodilla.backendkantor.domain.ActionType;
import com.kodilla.backendkantor.domain.ActionTypeDto;
import com.kodilla.backendkantor.domain.RatesCurrentDto;

public class RatesCurrentMapper {
    public RatesCurrentDto mapToActionTypeDto(final ActionType actionType) {
        return new ActionTypeDto(actionType.getActionId(), actionType.getActivityType(), actionType.getTable());
    }

    public ActionType mapToActionType(final ActionTypeDto actionTypeDto) {
        ActionType actionType = new ActionType();
        actionType.setActionId(actionTypeDto.getActionId());
        actionType.setActivityType(actionTypeDto.getActivityType());
        actionType.setTable(actionTypeDto.getTable());
        return actionType;
    }
}
