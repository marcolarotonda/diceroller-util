package io.github.marcolarotonda.dicerollerutil.model;

import io.github.marcolarotonda.dicerollerutil.enumeration.DiceType;
import io.github.marcolarotonda.dicerollerutil.enumeration.RollType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RollOption {
    private DiceType diceType;
    @Builder.Default
    private RollType rollType = RollType.NORMAL;
    @Builder.Default
    private int quantity = 1;
    @Builder.Default
    private int modifier = 0;
    @Builder.Default
    private boolean merit = false;
}
