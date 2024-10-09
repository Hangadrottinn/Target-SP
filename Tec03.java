import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import java.io.File;

public class Tec03 {
    public static void main(String[] args) {

        try {
            File inputFile = new File("dados.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();

            NodeList nList = doc.getElementsByTagName("row");
            if (nList == null || nList.getLength() == 0) {
                System.out.println("Nenhum dado encontrado no XML.");
                return;
            }

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;
            double somaFaturamento = 0.0;
            int totalDias = nList.getLength();
            int totalDiasU = totalDias;
            int diasAcimaDaMedia = 0;

            double[] faturamentos = new double[totalDias];

            for (int i = 0; i < totalDias; i++) {
                Element row = (Element) nList.item(i);

                Element valorElement = (Element) row.getElementsByTagName("valor").item(0);

                double faturamento = Double.parseDouble(valorElement.getTextContent());
                faturamentos[i] = faturamento;

                if (faturamento == 0) {
                    totalDiasU = totalDiasU - 1;
                }

                else {
                    if (faturamento < menorFaturamento) {
                        menorFaturamento = faturamento;
                    }
                    if (faturamento > maiorFaturamento) {
                        maiorFaturamento = faturamento;
                    }

                    somaFaturamento += faturamento;
                }
            }

            double mediaMensal = somaFaturamento / totalDiasU;

            for (double faturamento : faturamentos) {
                if (faturamento > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor faturamento: " + menorFaturamento);
            System.out.println("Maior faturamento: " + maiorFaturamento);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
