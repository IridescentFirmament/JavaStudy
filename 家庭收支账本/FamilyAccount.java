import java.util.Scanner;
import java.lang.Double;
public class FamilyAccount {
	
	static double account = 10000.0;
	static double[] in = new double[100];
	static int inPtr = 0;
	static int outPtr = 0;
	static double[] out = new double[100];
	static String[] inDetails = new String[100];
	static int inDetailsPtr = 0;
	static String[] outDetails = new String[100];
	static int outDetailsPtr = 0;
	static String one = String.format("%24s\n", "1 入账");
	static String two = String.format("%24s\n", "2 支出");
	static String three = String.format("%24s\n", "3 查看");
	static String four = String.format("%24s\n", "4 退出");
	static Scanner scan = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		while(true) {
			menu();
			char selection = readSelection();
			judgeSelection(selection);
		}	
	}
	
	
	public static boolean inAccount() {
		System.out.print("请输入金额:");
		String inputCash = scan.next();
		double cash = 0.0;
		try {
			cash = Double.parseDouble(inputCash);
		} catch(Exception e) {
			return false;
		}
		in[inPtr] = cash;
		inPtr++;
		account += cash;
		System.out.print("请输入金钱来源:");
		String inputDetail = scan.next();
		inDetails[inDetailsPtr] = inputDetail;
		inDetailsPtr++;
		return true;
	}
	
	
	public static boolean outAccount() {
		System.out.print("请输入金额:");
		String inputCash = scan.next();
		double cash = 0.0;
		try {
			cash = Double.parseDouble(inputCash);
		} catch(Exception e) {
			return false;
		}
		out[outPtr] = cash;
		outPtr++;
		account -= cash;
		System.out.print("请输入金钱去向:");
		String inputDetail = scan.next();
		outDetails[outDetailsPtr] = inputDetail;
		outDetailsPtr++;
		return true;
	}
	
	
	public static void lookUpAccount() {
		String inLines = "";
		String outLines = "";
		String head = String.format("%-18s%-20s%-30s", "序号", "金额", "原因");
		System.out.println("=======================================");
		System.out.println(head);
		int rows = 0;
		for (; rows <= inPtr + outPtr - 1; rows++) {
			if (rows < inPtr) {
				inLines += String.format("%-18d%-20.2f%-30s\n", rows+1, in[rows], inDetails[rows]);
			} else {
				outLines += String.format("%-18d%-20.2f%-30s\n", rows+1, out[rows-inPtr], outDetails[rows-inPtr]);
			}
		}
		String yuELine = String.format("余额:%f\n", account);
		System.out.print(inLines + outLines + yuELine);
	}
	
	
	public static void checkExit() {
		while(true) {
			System.out.print("确定要退出么[Y/N]:");
			String inputSelection = scan.next();
			char cInputSelection = inputSelection.charAt(0);
			if (cInputSelection == 'Y') {
				System.exit(0);
			} else if (cInputSelection == 'N') {
				break;
			}
		}
	}
		
	
	public static void judgeSelection(char selection) {
		switch(selection) {
			case '1':
			boolean flag = inAccount();
			while(flag == false) {
				System.out.println("金额应该只包含数字和小数点，请重新输入");
				flag = inAccount();
			}
			break;
			case '2':
			flag = outAccount();
			while(flag == false) {
				System.out.println("金额应该只包含数字和小数点，请重新输入");
				flag = outAccount();
			}
			break;
			case '3':
			lookUpAccount();
			break;
			case '4':
			checkExit();
			break;
		}
	}
			
	
	public static void menu() {
		System.out.println("--------------------家庭收支明细--------------------");
		System.out.print(one + two + three + four);
	}
	
	
	public static char readSelection() {
		System.out.print("请输入操作选项:");
		String selection = "";
		char cSelection = ' ';
		while(true) {
			selection = scan.next();
			cSelection = selection.charAt(0);
			if (cSelection != '1' && cSelection != '2' && cSelection != '3' && cSelection != '4') {
				System.out.print("输入错误，请重新输入:");
			} else {
				return cSelection;
			}
		}
	}
}