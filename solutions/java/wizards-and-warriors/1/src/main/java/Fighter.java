class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if(!fighter.isVulnerable()) return 6;
        return 10;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    private boolean preparedSpell = false;

    @Override
    boolean isVulnerable() {
        if(preparedSpell) return false;
        return true;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if(preparedSpell) return 12;
        return 3;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    public void prepareSpell() {
        this.preparedSpell = true;
    }
}
