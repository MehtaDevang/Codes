import java.util.*;
public class CoinGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CoinGame obj = new CoinGame();
		int n = scanner.nextInt();
		String player1 = scanner.next();
		String player2 = scanner.next();
		
		int res = obj.game(n, player1, player2, player1);
		System.out.println(res);
	}
	
	public int game(int n, String player1, String player2, String turn) {
		if(n < 0) {
			return 0;
		}
		else if(n == 0) {
			return 1;
		}
		else {
				return (game(n-1, player1, player2, player1) + game(n-2, player1, player2, player1) + game(n-4, player1, player2, player1));
		}
	}
}
