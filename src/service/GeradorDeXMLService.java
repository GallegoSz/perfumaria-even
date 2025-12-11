package service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import model.Produto;
import model.Venda;

public class GeradorDeXMLService {

    public static void gerarNFCe(Venda venda) {
        try {
            File dir = new File("notas-offline");
            if (!dir.exists()) {
                dir.mkdirs();
            }

            String numeroNFCe = String.format("%08d", venda.getId());

            String nomeArquivo = "NFCe_" + numeroNFCe + ".xml";
            File arquivo = new File(dir, nomeArquivo);

            String xml = gerarXml(venda);

            FileWriter fw = new FileWriter(arquivo);
            fw.write(xml);
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String gerarXml(Venda venda) {
        Produto p = venda.getProduto();

        StringBuilder sb = new StringBuilder();

        sb.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        sb.append("<NFe>\n<infNFe versao=\"4.00\" Id=\"\">\n");

        sb.append("  <emit>\n");
        sb.append("    <CNPJ>12345678000199</CNPJ>\n");
        sb.append("    <xNome>Perfumaria Even</xNome>\n");
        sb.append("    <enderEmit>\n");
        sb.append("      <xLgr>Rua Teste</xLgr>\n");
        sb.append("      <nro>123</nro>\n");
        sb.append("      <xBairro>Centro</xBairro>\n");
        sb.append("      <cMun>5103403</cMun>\n");
        sb.append("      <xMun>Cuiaba</xMun>\n");
        sb.append("      <UF>MT</UF>\n");
        sb.append("      <CEP>78000000</CEP>\n");
        sb.append("    </enderEmit>\n");
        sb.append("    <IE>123456789</IE>\n");
        sb.append("    <CRT>1</CRT>\n");
        sb.append("  </emit>\n");

        sb.append("  <det nItem=\"1\">\n");
        sb.append("    <prod>\n");
        sb.append("      <cProd>").append(p.getId()).append("</cProd>\n");
        sb.append("      <xProd>").append(p.getNome()).append("</xProd>\n");
        sb.append("      <qCom>").append(venda.getQtd()).append("</qCom>\n");
        sb.append("      <vUnCom>").append(p.getPreco()).append("</vUnCom>\n");
        sb.append("      <vProd>").append(venda.getPrecoFinal()).append("</vProd>\n");
        sb.append("      <CFOP>5102</CFOP>\n");
        sb.append("      <uCom>UN</uCom>\n");
        sb.append("    </prod>\n");
        sb.append("  </det>\n");

        sb.append("  <total>\n");
        sb.append("    <ICMSTot>\n");
        sb.append("      <vProd>").append(venda.getPrecoFinal()).append("</vProd>\n");
        sb.append("      <vNF>").append(venda.getPrecoFinal()).append("</vNF>\n");
        sb.append("    </ICMSTot>\n");
        sb.append("  </total>\n");

        sb.append("  <ide>\n");
        sb.append("    <dhEmi>").append(LocalDateTime.now()
                .format(DateTimeFormatter.ISO_DATE_TIME)).append("</dhEmi>\n");
        sb.append("    <tpNF>1</tpNF>\n");
        sb.append("    <idDest>1</idDest>\n");
        sb.append("    <tpImp>4</tpImp>\n");
        sb.append("    <tpEmis>9</tpEmis>");
        sb.append("    <cDV>0</cDV>\n");
        sb.append("  </ide>\n");

        sb.append("</infNFe>\n</NFe>");

        return sb.toString();
    }
}

