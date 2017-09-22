import java.util.*;

public class LuckyMoney {

	public static void main(String[] args)
	{
		//读入总金额、红包数量
		double sum;
		int cent, num;
		Scanner s = new Scanner(System.in);
		sum = s.nextDouble();
		num = s.nextInt();
		s.close();
		//将总金额转换为分为单位的整型
		cent = (int)Math.round(100*sum);
		
		//随机生成每个红包的金额
		int[] money = new int[num];
		int cent_tmp = cent, num_tmp = num;
		Random r = new Random();
		for(int i=0; i<num-1; i++)
		{
			money[i] = r.nextInt(2*cent_tmp/num_tmp);
			//每个红包金额都不能为0
			if(money[i]==0)
				money[i] = 1;
			cent_tmp -= money[i];
			num_tmp--;
		}
		//最后一个红包为剩下的金额
		money[num-1] = cent_tmp;
		
		for(int i=0; i<num; i++)
			System.out.printf("%.2f    ", ((double)money[i]/100));
	}

}
