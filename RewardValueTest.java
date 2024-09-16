package com.example.rewards;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RewardValueTest {

    @Test
    public void testCashToMilesConversion() {
        RewardValue reward = new RewardValue(1000); // $1000
        assertEquals(1000 / 0.0035, reward.getMilesValue(), 0.01, "Cash to miles conversion failed");
    }

    @Test
    public void testMilesToCashConversion() {
        RewardValue reward = new RewardValue(3500, true); // 3500 miles
        assertEquals(3500 * 0.0035, reward.getCashValue(), 0.01, "Miles to cash conversion failed");
    }

    @Test
    public void testGetters() {
        RewardValue rewardFromCash = new RewardValue(500); // $500
        RewardValue rewardFromMiles = new RewardValue(1750, true); // 1750 miles

        assertEquals(500, rewardFromCash.getCashValue(), 0.01, "Cash value getter failed");
        assertEquals(1750, rewardFromMiles.getMilesValue(), 0.01, "Miles value getter failed");
    }
}