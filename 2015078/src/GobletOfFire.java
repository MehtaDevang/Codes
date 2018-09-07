	import java.util.*;
	
	class Node{
		int school;
		int roll;
		Node next;
		Node pre;
		
		Node(int s, int r){
			this.school = s;
			this.roll = r;
			this.next = null;
			this.pre = null;
		}
	}
	
	public class GobletOfFire {
		Node front;
		Node last;
		int count = 0;
		
		public GobletOfFire() {
			this.front = this.last = null;
		}
		
		public Node dequeue() {
			if(count == 1) {
				Node temp = front;
				front = null;
				last = null;
				count--;
				return temp;
			}
			else {
				Node temp = last;
				Node res = front;
				front = res.pre;
//				while(temp != front) {
//					prev = temp;
//					temp = temp.next;
//				}
//				front = prev;
				count--;
				return res;
			}
		}
		public void push(int school, int roll) {
			Node node = new Node(school, roll);
			boolean flag = false;
			if(count == 0) {
				this.front = node;
				this.last = node;
			}
			else {
				Node temp = last;
				Node prev = last;
				while(true) {
					if(count == 1 && temp.school == node.school) {
						node.next = temp;
						temp.pre = node;
					}
					else if(temp == front && temp.school != node.school) {
						break;
					}
					else if(temp.school == node.school) {
						prev.next = node;
						node.pre = prev;
						node.next = temp;
						temp.pre = node;
						flag = true;
						break;
					}
					else {
						prev = temp;
						temp = temp.next;
					}
				}
				if(flag == false) {
					Node t = last;
					node.next = temp;
					t.pre = node;
					last = node;
				}
			}
			count++;
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int q = Integer.parseInt(scanner.nextLine());
			GobletOfFire obj = new GobletOfFire();
			
			for(int i = 0; i < q; i++) {
				String[] str = scanner.nextLine().trim().split(" ");
				String operation = str[0];
			
				if(operation.equals("E")) {
					int school = Integer.parseInt(str[1].trim());
					int roll = Integer.parseInt(str[2].trim());
					obj.push(school, roll);
				}
				else {
					Node temp = obj.dequeue();
					System.out.println(temp.school + " " + temp.roll);
				}
			}
	//		Node temp = obj.last;
	////		System.out.println(obj.last.school);
	//		while(temp != null) {
	//			System.out.println(temp.school+ " " + temp.roll);
	//			temp = temp.next;
	//		}
		}
	}
