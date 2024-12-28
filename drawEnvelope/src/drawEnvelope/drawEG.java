package drawEnvelope;

public class drawEG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = new int[8];
		int[] y = new int[8];
		// Paramètres par défaut du canvas qui reçoit le dessin
		int width=640;
		int height=480;
		int keyOn=(int)Math.round(width * 0.1);
		int keyOff=(int)Math.round(width * 0.66);
		double toRadian = Math.PI / 2 / 99 ;
		// enveloppe initiale
		int R1=90;
		int L1=70;
		int R2=60;
		int L2=85;
		int R3=30;
		int L3=99;
		int R4=42;
		int L4=10;
		
		// calcul du point 1
		x[0]=0 ;
		y[0]=L4;
		// calcul du point 2
		x[1]=keyOn;
		y[1]=y[0];
		// calcul du point 3
		if(R1 > 98) { 
			// on va à la verticale
			x[2]=x[1];
			y[2]=L1;
		} else if(R1 < 1) {
			// on reste à l'horizontale
			x[2]=keyOff;
			y[2]=y[1];
		} else {
			// OK, on doit tenir compte de R1
			double tetha = R1 * toRadian;
			double deltaX = keyOff-x[1]; // toujours positif
			double deltaY = (L1-y[1]); // positif ou négatif
			double incY = deltaX * Math.tan(tetha); //
			if(incY > deltaY) {
				// on atteind le niveau avant keyOff en cos(R1)
				x[2]=x[1]+(int)Math.round(deltaX * Math.cos(tetha));
				y[2]=L1;
			} else {
				// on atteind keyOff avant le niveau en sin(R1)
				x[2]=keyOff;
				y[2]=x[1]+(int)Math.round(deltaX * Math.sin(tetha));
			}
		}
		// calcul du point 4
		if(R2 > 98) {
			// on va à la verticale, même si L1 n'est pas atteint
			x[3]=x[2];
			y[3]=L2;
		} else if(R2 < 1) {
			// on reste à l'horizontale, idem, même si L1 n'est pas encore atteint
			x[3]=keyOff;
			y[3]=y[2];
		} else if(x[2] >= keyOff) {
			// la touche est déjà relâchée
			x[3]=x[2];
			y[3]=y[2];
		} else {
			// OK, on doit tenir compte de R2
			double tetha = R2 * toRadian;
			double deltaX = keyOff-x[2]; // toujours positif
			double deltaY = (L2-y[2]); // positif ou négatif
			double incY = deltaX * Math.tan(tetha); //
			if(incY > deltaY) {
				// on atteint le niveau avant keyOff en cos(R2)
				x[3]=x[2]+(int)Math.round(deltaX * Math.cos(tetha));
				y[3]=L2;
			} else {
				// on atteint keyOff avant le niveau en sin(R2)
				x[3]=keyOff;
				y[3]=x[2]+(int)Math.round(deltaX * Math.sin(tetha));
			}
		}
		// calcul du point 5
		if(R3 > 98) {
			// on va à la verticale, même si L2 n'est pas atteint
			x[4]=x[3];
			y[4]=L3;
		} else if(R3 < 1) {
			// on reste à l'horizontale, idem, même si L2 n'est pas encore atteint
			x[4]=keyOff;
			y[4]=y[3];
		} else if(x[3] >= keyOff) {
			// la touche est déjà relâchée
			x[4]=x[3];
			y[4]=y[3];
		} else {
			// OK, on doit tenir compte de R3
			double tetha = R3 * toRadian;
			double deltaX = keyOff-x[3]; // toujours positif
			double deltaY = (L3-y[3]); // positif ou négatif
			double incY = deltaX * Math.tan(tetha); //
			if(incY > deltaY) {
				// on atteind le niveau avant keyOff en cos(R3)
				x[4]=x[3]+(int)Math.round(deltaX * Math.cos(tetha));
				y[4]=L3;
			} else {
				// on atteind keyOff avant le niveau en sin(R3)
				x[4]=keyOff;
				y[4]=x[3]+(int)Math.round(deltaX * Math.sin(tetha));
			}
		}		
		
		System.out.println("fin");
	}
}
