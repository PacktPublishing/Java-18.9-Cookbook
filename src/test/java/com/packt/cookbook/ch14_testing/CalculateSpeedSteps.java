package com.packt.cookbook.ch14_testing;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculateSpeedSteps {
    private Vehicle vehicle;
    private double speed;

    @Given("the vehicle has {int} hp engine and weighs {int} pounds")
    public void the_vehicle_has_hp_engine_and_weighs_pounds(Integer wp, Integer hp) {
        vehicle = new Vehicle(wp, hp);
    }

    @When("the application calculates its speed after {double} sec")
    public void the_application_calculates_its_speed_after_sec(Double t) {
        speed = vehicle.getSpeedMpH(t);
    }

    @Then("the result should be {double} mph")
    public void the_result_should_be_mph(Double speed) {
        assertEquals(speed, this.speed, 0.0001 * speed);
    }

    class Vehicle {
        private int wp, hp;
        public Vehicle(int weightPounds, int hp){
            this.wp = weightPounds;
            this.hp = hp;
        }

        protected double getSpeedMpH(double timeSec){
            double v = 2.0 * this.hp * 746 ;
            v = v*timeSec * 32.174 / this.wp;
            return Math.round(Math.sqrt(v) * 0.68);
        }

    }
}


