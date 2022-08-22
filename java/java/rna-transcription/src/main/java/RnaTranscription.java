class RnaTranscription {
    public String transcribe(String dnaStrand) {
        String rna = "";
        if (dnaStrand == null || "".equals(dnaStrand)) {
            rna = "";
        } else {
            for (int i = 0; i < dnaStrand.length(); i++) {
                char currentChar = dnaStrand.charAt(i);
                switch (currentChar) {
                    case 'C':
                        rna += "G";
                        break;
                    case 'G':
                        rna += "C";
                        break;
                    case 'T':
                        rna += "A";
                        break;
                    case 'A':
                        rna += "U";
                        break;
                }
            }
        }
        return rna;
    }

}
