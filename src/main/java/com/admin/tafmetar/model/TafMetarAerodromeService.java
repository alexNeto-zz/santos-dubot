package com.admin.tafmetar.model;

import com.admin.tafmetar.enumerate.TargetType;
import com.admin.tafmetar.shared.BusinessException;
import com.admin.tafmetar.utils.DateTimeUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class TafMetarAerodromeService {

    private List<TargetType> targetList;
    private String locale;

    public TafMetarAerodromeService(String locale) {
        this.locale = locale;
    }

    public String buildUrl(TargetType target) throws BusinessException {
        String protocol = "http://";
        String urlStem = "www.redemet.aer.mil.br/api/consulta_automatica/index.php?local=";
        String urlTaf = "&msg=metar&data_ini=";
        String urlMetar = "&msg=taf&data_ini=";
        String urlAerodromeInfo = "&msg=aviso_aerodromo&data_ini=";
        String endDate = "&data_fim=";

        StringBuffer urlBuffer = new StringBuffer();
        urlBuffer.append(protocol);
        urlBuffer.append(urlStem);
        if (this.locale == null || this.locale.isEmpty()) {
            throw new BusinessException("O local está vazio"); // TODO - adicionar I18N
        } else {
            urlBuffer.append(locale);
        }
        if (target == null) {
            throw new BusinessException("O modo desejado deve ser informado"); // TODO - adicionar I18N
        } else {
            if (target == TargetType.TAF) {
                urlBuffer.append(urlTaf);
            }
            if (target == TargetType.METAR) {
                urlBuffer.append(urlMetar);
            }
            if (target == TargetType.AERODROME) {
                urlBuffer.append(urlAerodromeInfo);
            }
            DateTimeUtils now = new DateTimeUtils();
            urlBuffer.append(now.getFormatedDate());
            urlBuffer.append(endDate);
            urlBuffer.append(now.getFormatedDate());
        }
        return urlBuffer.toString();
    }

    public List<String> getResponse() throws BusinessException {
        String url;
        List<String> response = new ArrayList<>();
        for (TargetType target : targetList) {
            url = this.buildUrl(target);
            response.add(this.makeRequest(url));
        }
        return response;
    }

    public String makeRequest(String urlStr) throws BusinessException {
        String partialResponse = "outro algo";
        BufferedReader reader = null;
        try {
         //   URL url = new URL(urlStr);
         //   reader = new BufferedReader(new InputStreamReader(url.openStream()));
          //  partialResponse = reader.readLine();
        } catch (Exception e) {
            throw new BusinessException("Não conseguimos acessar os dados desejados, tente novamente"); // TODO - adicionar I18N
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                throw new BusinessException("Algo deu muito errado, tente de novo"); // TODO - adicionar I18N
            }
        }
        return partialResponse; // TODO - implements
    }

    public void setTargetList(List<TargetType> targetList) {
        this.targetList = targetList;
    }
}
