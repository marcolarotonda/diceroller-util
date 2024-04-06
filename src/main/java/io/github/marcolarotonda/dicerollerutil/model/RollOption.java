package io.github.marcolarotonda.dicerollerutil.model;

import io.github.marcolarotonda.dicerollerutil.enumeration.DiceType;
import io.github.marcolarotonda.dicerollerutil.enumeration.RollType;
import lombok.Data;

@Data
public class RollOption {
    private DiceType diceType;
    private RollType rollType = RollType.NORMAL;
    private int quantity = 1;
    private int modifier = 0;
    private boolean merit = false;
}
