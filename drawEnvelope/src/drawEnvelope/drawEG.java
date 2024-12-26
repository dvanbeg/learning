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
		int R1=99;
		int L1=99;
		int R2=99;
		int L2=99;
		int R3=99;
		int L3=99;
		int R4=99;
		int L4=0;
		
		// calcul du point 1
		x[0]=0 ;
		y[0]=L4;
		// calcul du point 2
		x[1]=keyOn;
		y[1]=y[0];
		// calcul du point 3
		if (R1 > 98) { 
				x[2]=x[1];
				y[2]=L1;
			} else if (R1 < 1) {
				x[2]=keyOff;
				y[2]=y[1];
			} else {
				double tetha = R1 * toRadian;
				double deltaX = keyOff-x[1]; // toujours positif
				double deltaY = (L1-L4); // positif ou négatif
				double incY = deltaX * Math.tan(tetha); //
				if (incY > deltaY) {
					// on atteind le niveau avant keyOff en cos(R1)
					x[2]=(int)Math.round(deltaX * Math.cos(tetha));
					y[2]=L1;
				} else {
					// on atteind keyOff avant le niveau en sin(R1)
				}

			if(eg[0].r < 99)
		}

	}

}
