package HarryPotter;

public class ComicBook extends Book {
		private String characterName;
		
		public ComicBook(double regularPrice, String publisher, int yearPublished, String characterName) {
			super( regularPrice,  publisher,  yearPublished);
			this.characterName = characterName;
		}
		
		
		public double discountComic() {
			return super.getRegularPrice()*0.6;
		}


		public String getCharacterName() {
			return characterName;
		}


		public double computeSalePrice(){
	        return super.getRegularPrice() * 0.4;
	    }
		
}
