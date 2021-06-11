package com.company;

class Service{
    private Algorithm logic;
    public void setLogic(Algorithm logic){
        this.logic = logic;
    }
    public void doProcess(String name){
        System.out.println("start");
        this.logic.perform(name);
        System.out.println("end");
    }
}


