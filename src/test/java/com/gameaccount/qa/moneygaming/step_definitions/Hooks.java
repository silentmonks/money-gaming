package com.gameaccount.qa.moneygaming.step_definitions;

import com.gameaccount.qa.moneygaming.utilities.Driver;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    @After
    public void closeAndQuitDriver(){
        Driver.closeDriver();
    }
}