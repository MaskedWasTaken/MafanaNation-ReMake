package me.TahaCheji.itemData;

public enum GameItemLevelXPTo {
    ONE(100),
    TWO(GameItemLevelXPTo.ONE.getXp() * 2),
    THREE(GameItemLevelXPTo.TWO.getXp() * 2),
    FOUR(GameItemLevelXPTo.THREE.getXp() * 2),
    FIVE(GameItemLevelXPTo.FOUR.getXp() * 2),
    SIX(GameItemLevelXPTo.FIVE.getXp() * 2),
    SEVEN(GameItemLevelXPTo.SIX.getXp() * 2),
    EIGHT(GameItemLevelXPTo.SEVEN.getXp() * 2),
    NINE(GameItemLevelXPTo.EIGHT.getXp() * 2),
    TEN(GameItemLevelXPTo.NINE.getXp() * 2);

    private final int xp;

    GameItemLevelXPTo(int xp) {
        this.xp = xp;
    }

    public int getXp() {
        return xp;
    }

    public static GameItemLevelXPTo getXpTo (GameItemLevel gameWeaponLevel) {
        if(gameWeaponLevel.getLevel() == 0) {
            return GameItemLevelXPTo.ONE;
        }
        if(gameWeaponLevel.getLevel() == 1) {
            return GameItemLevelXPTo.TWO;
        }
        if(gameWeaponLevel.getLevel() == 2) {
            return GameItemLevelXPTo.THREE;
        }
        if(gameWeaponLevel.getLevel() == 3) {
            return GameItemLevelXPTo.FOUR;
        }
        if(gameWeaponLevel.getLevel() == 4) {
            return GameItemLevelXPTo.FIVE;
        }
        if(gameWeaponLevel.getLevel() == 5) {
            return GameItemLevelXPTo.SIX;
        }
        if(gameWeaponLevel.getLevel() == 6) {
            return GameItemLevelXPTo.SEVEN;
        }
        if(gameWeaponLevel.getLevel() == 7) {
            return GameItemLevelXPTo.EIGHT;
        }
        if(gameWeaponLevel.getLevel() == 8) {
            return GameItemLevelXPTo.NINE;
        }
        if(gameWeaponLevel.getLevel() == 9) {
            return GameItemLevelXPTo.TEN;
        }
        return null;
    }


}
