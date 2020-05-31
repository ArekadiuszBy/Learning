package com.company;

public enum MovieCategory {
    //z wielkich liter - stałe
    HORROR("horror"){
        @Override
        boolean isCool() {
            return true;
        }
    },
    ACTION("akcji"){
        @Override
        boolean isCool() {
            return false;
        }
    },
    ROMANTIC("romantyczny"){
        @Override
        boolean isCool() {
            return true;
        }
    },
    DOCUMENT("dokumentalny"){
        @Override
        boolean isCool() {
            return false;
        }
    };


    private String displayName;

    abstract boolean isCool();

    MovieCategory(String displayName){
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
