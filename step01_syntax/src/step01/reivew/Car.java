/* �н�����
 * 1. �ڵ����� �ΰ��� �����͸� ����
 * 		- �� ��ȣ(����), ������ �̸�
 * 2. Car ������ 2����= Car ��ü 2�� ����
 * 3. ��� ������ �����ڸ� ���ؼ� �ʱ�ȭ
 * 4. �������� API Ȱ���ؼ� �ܼ�â�� Car ������ ���
 */
package step01.reivew;

		
public class Car {
		String carName;
		int number;
		
		//��� ������� ���� �������� �ٸ���� this.name �� this Ű���� ���ʿ�
		Car(String n ,int no){
			carName = n;
			number = no;
		}
		public static void main(String [] args) {
			Car c1 = new Car("���", 11);
			Car c2 = new Car("����", 22);
			System.out.println(c1.carName+ " ---" + c1.number + "," + c2.carName + "---" + c2.number);
		}
		
		
		/*Car(String name, int CarNum){
			this.name=name;
			this.CarNum=CarNum;
		}
		public static void main(String [] args) {
			Car s1= new Car("���", 7276);
			Car s2= new Car("����", 1234);
			
			System.out.println(s1.name+ " ---" + s1.CarNum + "," + s2.name + "---" + s2.CarNum);
		}*/
}

