package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Random;

@Controller
public class RollDiceController {
    Random rand = new Random();

    @GetMapping("/roll-dice")
    public void numGuess(Model model) {
//        int Dice = rand.nextInt(6)+1;
//        model.addAllAttributes("RollDice", Dice);
//        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    public void userInput(@PathVariable int n, Model model){
//        int Dice= rand.nextInt(6)+1;
//        model.addAllAttributes("RollDice", Dice);
//        model.addAllAttributes("num", n);
    }

}
