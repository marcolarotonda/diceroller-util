package io.github.marcolarotonda.dicerollerutil.model;

import io.github.marcolarotonda.dicerollerutil.enumeration.DiceType;
import io.github.marcolarotonda.dicerollerutil.enumeration.RollType;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RollOptionTest {

    @Test
    void checkNoArgConstructor() {
        RollOption rollOption = new RollOption();
        assertThat(rollOption.getDiceType()).isNull();
        assertThat(rollOption.getRollType()).isEqualTo(RollType.NORMAL);
        assertThat(rollOption.getModifier()).isZero();
        assertThat(rollOption.getQuantity()).isEqualTo(1);
        assertThat(rollOption.isMerit()).isFalse();
    }

    @Test
    void checkAllArgConstructor() {
        RollOption rollOption = new RollOption(DiceType.D12,
                RollType.ADVANTAGE,
                4,
                3,
                true);
        assertThat(rollOption.getDiceType()).isEqualTo(DiceType.D12);
        assertThat(rollOption.getRollType()).isEqualTo(RollType.ADVANTAGE);
        assertThat(rollOption.getQuantity()).isEqualTo(4);
        assertThat(rollOption.getModifier()).isEqualTo(3);
        assertThat(rollOption.isMerit()).isTrue();
    }

    @Test
    void checkEmptyBuilder() {
        RollOption rollOption = RollOption.builder().build();
        assertThat(rollOption.getDiceType()).isNull();
        assertThat(rollOption.getRollType()).isEqualTo(RollType.NORMAL);
        assertThat(rollOption.getModifier()).isZero();
        assertThat(rollOption.getQuantity()).isEqualTo(1);
        assertThat(rollOption.isMerit()).isFalse();
    }

    @Test
    void checkFullBuilder() {
        RollOption rollOption = RollOption.builder()
                .diceType(DiceType.D12)
                .rollType(RollType.ADVANTAGE)
                .modifier(4)
                .quantity(3)
                .merit(true)
                .build();
        assertThat(rollOption.getDiceType()).isEqualTo(DiceType.D12);
        assertThat(rollOption.getRollType()).isEqualTo(RollType.ADVANTAGE);
        assertThat(rollOption.getModifier()).isEqualTo(4);
        assertThat(rollOption.getQuantity()).isEqualTo(3);
        assertThat(rollOption.isMerit()).isTrue();
    }
}
