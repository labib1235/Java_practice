package com.company;

public class Main {

    public static void main(String[] args) {
        PersonInfoRepository personRepo = new PersonInfoRepository();


        /* PersonInfo pinfo = personRepo.getPersonInfoByName("khalid");
        System.out.println(pinfo);
        personRepo.deletePersonInfoById(4);



        PersonInfo personInfo = new PersonInfo("gangua", 30, "Namibia", "gangua@gmail.com");

        personRepo.savePersonInfo(personInfo);
         */


        PersonInfo personNFT = personRepo.getPersonById(2);

        System.out.println("before update");
        System.out.println(personNFT);


        personNFT.setAge(70);
        personNFT.setAddress("BFTTO");

        personRepo.updatePersonInfo(personNFT);

        System.out.println("after update");
        System.out.println(personNFT);


    }
}
