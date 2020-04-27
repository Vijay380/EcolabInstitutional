package com.test.utility;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.test.model.AccountInfoModel;
import com.test.model.UserDataModel;

public class GetUserData {
	public UserDataModel getTestData(String userType) {
		try {
			return Arrays
					.asList(new Gson().fromJson(
							new FileReader(System.getProperty("user.dir") + "/src/test/resources/testdata/userData.json"),
							UserDataModel[].class))
					.stream().filter(userData -> userData.getUserType().equals(userType)).findFirst().get();
		} catch (Exception e) {
			System.out.println("Test Data File not found");
			e.printStackTrace();
			return null;
		}

	}

	public static void setAccountName(String accountName) {
		AccountInfoModel accInfo = new AccountInfoModel();
		accInfo.setAccountInfo(accountName);
		FileWriter fr;
		try {
			fr = new FileWriter(
					System.getProperty("user.dir") + "/src/test/resources/testdata/AccountInfo.json");
			Gson gson = new Gson();
			gson.toJson(accInfo, fr);
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String getAccountName() {
		try {
			return new Gson().fromJson(
							new FileReader(System.getProperty("user.dir") + "/src/test/resources/testdata/AccountInfo.json"),
							AccountInfoModel.class).getAccountInfo();
		} catch (Exception e) {
			System.out.println("Account Info File not found");
			e.printStackTrace();
			return null;
		}

	}
}
