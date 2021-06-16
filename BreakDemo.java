package break在循环语句中使用;

public class BreakDemo {
	
	public void aMethod(){
		for(int i=0;i<100;i++){
			if(i==10){
				break;//如果条件满足，则结束循环
			}
			System.out.println(i);
		}
	}

	public void bMethod(){
		int i = 0;
		while(true){
			System.out.println(i++);
			if(i>10){
				break;//条件满足时，结束循环
			}
		}
	}
	
	public void cMethod(){
		int sum = 0;
		out:
		for(int i=0;i<10;i++){
			for(int j=0;j<5;j++){
				if(i%2==0){
					break out;
				}
				
				sum=i*j;
				System.out.print(i+"*"+j+"="+sum+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BreakDemo bd = new BreakDemo();
		bd.cMethod();

	}

}
