package com.rgsoft1.rg5117;

public class Main {

    public static void main(String[] args) {

        for (int cock = 0; cock < 100; cock++) {
            for (int hen = 0; hen < 100; hen++) {
                int chicken = 100-cock-hen;
                if (chicken%3 != 0){
                    continue;
                }
                if (cock*5+hen*3+chicken/3 == 100) {
                    System.out.println("cock = " + cock
                    + "hen = " + hen + "chicken = " + chicken);
                }
            }
        }

    }

}
