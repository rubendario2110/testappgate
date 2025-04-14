package org.example;

import org.example.services.Solution;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println(sol.numDistinct("rabbbit", "rabbit"));
        System.out.println(sol.numDistinct("babgbag", "bag"));
    }
}