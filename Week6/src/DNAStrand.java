public class DNAStrand {
	private String dna;
	
	public DNAStrand(String dna) {
		this.dna = dna;
	}
	/*public Boolean isValidDNA() {
		if (dna == null || dna == "")
			return false;
		String dnaWithoutTCGA = dna.replace("T", "").replaceAll("C", "").replace("A", "").replace("G", "");
		return dnaWithoutTCGA.length() == 0;
	}*/
	/*public boolean isValidDNA() {
		for (int i =0; i < dna.length(); i++) {
			if ((dna.charAt(i)) != 'T' || (dna.charAt(i)) != 'A' || (dna.charAt(i)) != 'C' || (dna.charAt(i)) != 'G') {
				return false; 
			}
		}
		return true; 
	}*/
	public boolean isValidDNA() {
		if (dna.length() == 0) {
	  		return false;
	  	}
	    for (int i = 0; i < dna.length(); i++) {
	  		if (! ( "ACGT".contains ("" + dna.charAt(i)))){
	  			return false;
	        }
	    }
	    return true;
	}
	
	public String complementWC() {
		String swapAT = dna.replace("T", "t").replace("A", "T").replace("t", "A");
		String swapATCG = swapAT.replace("G", "g").replace("C", "G").replace("g", "C");
		return swapATCG;
	}
	
	public String palindromeWC() {
		String comp = complementWC();
		String res = "";
		for (int i = comp.length() - 1; i >= 0; i--) {
			res += comp.charAt(i);
		}
		return res;
	}
	public Boolean containsSequence(String seq) {
		return dna.contains(seq);
	}
	public String toString() {
		return dna;
	}
}
