public class Vaje1{

	static void pravokotnik(int odmik, int visina, int sirina){
		for(int v = 0;v < visina; v++){
			System.out.println();
			for(int o = 0; o < odmik; o++){
				System.out.print("  ");
				}
			for(int s = 0; s < sirina; s++){
				System.out.print("# ");
				}
			}
		}

	static void trikotnik(int odmik, int visina){
		int znak = 1;
		for(int v = 0; v < visina; v++){
			for(int o = 0; o < visina - v; o++){
				System.out.print("  ");
			}
			for(int z = 0; z < znak ; z++){
			System.out.print("# ");
			}

			znak = znak + 2; 
			System.out.println();

		}
	}


	static void trikotnikV(int odmik, int visina){
		int znak = 2 * visina -1;
		for(int v = 0; v < visina; v++){
			for(int o = 0; o < v; o++){
				System.out.print("  ");
			}
			for(int z = 0; z < znak ; z++){
			System.out.print("# ");
			}

			znak = znak - 2; 
			System.out.println();

		}

	}


	static void rombPrazen(int odmik, int visina){
		int znak = 1;
		for(int v = 0; v < visina-1; v++){
			for(int o = 0; o < visina - v; o++){
				System.out.print("# ");
			}
			for(int z = 0; z < znak ; z++){
			System.out.print(". ");
			}
			for(int o = 0; o < visina - v; o++){
				System.out.print("# ");
			}
			znak = znak + 2; 
			System.out.println();
		}

		int znak2 = 2 * visina - 1;
		 for(int v = 0; v < visina; v++){
			for(int o = 0; o < v; o++){
				System.out.print("# ");
			}
			for(int z = 0; z < znak2 ; z++){
			System.out.print(". ");
			}
			for(int o = 0; o < v; o++){
				System.out.print("# ");
			}
			znak2 = znak2 - 2; 
			System.out.println();

		}
	}

	static void romb(int odmik, int velikost){
		trikotnik(odmik+1, velikost-1);
		trikotnikV(odmik, velikost);
	}
	public static void main(String[] args){
		pravokotnik(5,3,7);
		
		println();

		trikotnik(5,3);
		
		println();

		trikotnikV(1,5);

		println();

		romb(1,5);

		println();
		
		rombPrazen(1,5);

	}
}