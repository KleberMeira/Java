
public class Data implements Comparable {

		private int dia;
		private int mes;
		private int ano;

		public Data(int dia, int mes, int ano) {
			this.dia = dia;
			this.mes = mes;
			this.ano = ano;
		}

		public int getDia() {
			return dia;
		}

		public void setDia(int dia) {
			this.dia = dia;
		}

		public int getMes() {
			return mes;
		}

		public void setMes(int mes) {
			this.mes = mes;
		}

		public int getAno() {
			return ano;
		}

		public void setAno(int ano) {
			this.ano = ano;
		}

		/*public int compare(Data d) {
			if(compareAno(d.getAno()) != 0)
				return compareAno(d.getAno());
			else{
				if(compareMes(d.getMes()) != 0)
					return compareMes(d.getMes());
				else{
					if(compareDia(d.getDia()) != 0)
						return compareDia(d.getDia());
				}
			}
			
			return 0;

		}*/

		public int compareAno(int ano) {
			if (this.ano < ano)
				return -1;
			else if (this.ano > ano)
				return 1;

			return 0;
		}
		public int compareMes(int mes) {
			if (this.mes < mes)
				return -1;
			else if (this.mes > mes)
				return 1;

			return 0;
		}
		public int compareDia(int dia) {
			if (this.dia < dia)
				return -1;
			else if (this.dia > dia)
				return 1;

			return 0;
		}

		@Override
		public int compareTo(Object arg) {
			Data d = (Data)arg;
			
			if(compareAno(d.getAno()) != 0)
				return compareAno(d.getAno());
			else{
				if(compareMes(d.getMes()) != 0)
					return compareMes(d.getMes());
				else{
					if(compareDia(d.getDia()) != 0)
						return compareDia(d.getDia());
				}
			}
			
			return 0;
		}
	}

	
	

