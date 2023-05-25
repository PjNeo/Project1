package OOPIS;


/**
 * Enum um die Sequenztypen abzuspeichern und diese dann zu nutzen um die verschiedenen Objekte
 * in der Factory zu erschaffen.
 */
public enum SeqTypeEn {
        DNA,
        RNA,
        PEPTIDE,
        AMBIGUOUS;

    /**
     *
     * @param sequence
     * @return DNA, RNA, PEPTIDE, AMBIGUOUS
     */
        public static SeqTypeEn identifySequenceType(String sequence) {
            String sequenceType = sequence.toUpperCase();
            if (sequenceType.matches("DNA")) {
                return DNA;
            } else if (sequenceType.matches("RNA")) {
                return RNA;
            } else if (sequenceType.matches("PEPTIDE")) {
                return PEPTIDE;
            } else {
                return AMBIGUOUS;
            }
        }

}
