package com.admin.tafmetar.bancodedados;

import java.util.ArrayList;
import java.util.List;

public class InsertsAerodromo {

    protected List<Aerodromos> aerodromosList = new ArrayList<>();

    private Aerodromos sbrf = new Aerodromos("sbrf", null);
    private Aerodromos sbeg = new Aerodromos("sbeg", null);
    private Aerodromos sbee = new Aerodromos("sbee", null);

    public void insertSBBR() {
        Aerodromos sbbr = new Aerodromos("sbbr", null);
        aerodromosList.add(sbbr);
        aerodromosList.add(new Aerodromos("sban", sbbr));
        aerodromosList.add(new Aerodromos("sbbh", sbbr));
        aerodromosList.add(new Aerodromos("sbbw", sbbr));
        aerodromosList.add(new Aerodromos("sbcf", sbbr));
        aerodromosList.add(new Aerodromos("sbcn", sbbr));
        aerodromosList.add(new Aerodromos("sbgo", sbbr));
        aerodromosList.add(new Aerodromos("sbip", sbbr));
        aerodromosList.add(new Aerodromos("sbit", sbbr));
        aerodromosList.add(new Aerodromos("sbls", sbbr));
        aerodromosList.add(new Aerodromos("sbmk", sbbr));
        aerodromosList.add(new Aerodromos("sbpj", sbbr));
        aerodromosList.add(new Aerodromos("sbpr", sbbr));
    }

    public void insertSBGR() {
        Aerodromos sbgr = new Aerodromos("sbbr", null);
        aerodromosList.add(sbgr);
        aerodromosList.add(new Aerodromos("sbaq", sbgr));
        aerodromosList.add(new Aerodromos("sbax", sbgr));
        aerodromosList.add(new Aerodromos("sbbp", sbgr));
        aerodromosList.add(new Aerodromos("sbgp", sbgr));
        aerodromosList.add(new Aerodromos("sbjd", sbgr));
        aerodromosList.add(new Aerodromos("sbkp", sbgr));
        aerodromosList.add(new Aerodromos("sbmt", sbgr));
        aerodromosList.add(new Aerodromos("sbpc", sbgr));
        aerodromosList.add(new Aerodromos("sbrp", sbgr));
        aerodromosList.add(new Aerodromos("sbsp", sbgr));
        aerodromosList.add(new Aerodromos("sbsr", sbgr));
        aerodromosList.add(new Aerodromos("sbul", sbgr));
        aerodromosList.add(new Aerodromos("sbur", sbgr));
        aerodromosList.add(new Aerodromos("sbvg", sbgr));
        aerodromosList.add(new Aerodromos("sbys", sbgr));
    }

    public void insertSBGL() {
        Aerodromos sbgl = new Aerodromos("sbgl", null);
        aerodromosList.add(sbgl);
        aerodromosList.add(new Aerodromos("sbaf", sbgl));
        aerodromosList.add(new Aerodromos("sbbq", sbgl));
        aerodromosList.add(new Aerodromos("sbcb", sbgl));
        aerodromosList.add(new Aerodromos("sbcp", sbgl));
        aerodromosList.add(new Aerodromos("sbec", sbgl));
        aerodromosList.add(new Aerodromos("sbes", sbgl));
        aerodromosList.add(new Aerodromos("sbfs", sbgl));
        aerodromosList.add(new Aerodromos("sbgw", sbgl));
        aerodromosList.add(new Aerodromos("sbjf", sbgl));
        aerodromosList.add(new Aerodromos("sbjr", sbgl));
        aerodromosList.add(new Aerodromos("sblb", sbgl));
        aerodromosList.add(new Aerodromos("sbme", sbgl));
        aerodromosList.add(new Aerodromos("sbmm", sbgl));
        aerodromosList.add(new Aerodromos("sbrj", sbgl));
        aerodromosList.add(new Aerodromos("sbsc", sbgl));
        aerodromosList.add(new Aerodromos("sbsj", sbgl));
        aerodromosList.add(new Aerodromos("sbst", sbgl));
        aerodromosList.add(new Aerodromos("sbta", sbgl));
        aerodromosList.add(new Aerodromos("sbzm", sbgl));
    }

    public void insertSBPA() {
        Aerodromos sbpa = new Aerodromos("sbpa", null);
        aerodromosList.add(sbpa);
        aerodromosList.add(new Aerodromos("sbae", sbpa));
        aerodromosList.add(new Aerodromos("sbau", sbpa));
        aerodromosList.add(new Aerodromos("sbbg", sbpa));
        aerodromosList.add(new Aerodromos("sbbi", sbpa));
        aerodromosList.add(new Aerodromos("sbbu", sbpa));
        aerodromosList.add(new Aerodromos("sbca", sbpa));
        aerodromosList.add(new Aerodromos("sbcd", sbpa));
        aerodromosList.add(new Aerodromos("sbcg", sbpa));
        aerodromosList.add(new Aerodromos("sbch", sbpa));
        aerodromosList.add(new Aerodromos("sbcm", sbpa));
        aerodromosList.add(new Aerodromos("sbco", sbpa));
        aerodromosList.add(new Aerodromos("sbcr", sbpa));
        aerodromosList.add(new Aerodromos("sbct", sbpa));
        aerodromosList.add(new Aerodromos("sbcx", sbpa));
        aerodromosList.add(new Aerodromos("sbdb", sbpa));
        aerodromosList.add(new Aerodromos("sbdn", sbpa));
        aerodromosList.add(new Aerodromos("sbdo", sbpa));
        aerodromosList.add(new Aerodromos("sbfi", sbpa));
        aerodromosList.add(new Aerodromos("sbfl", sbpa));
        aerodromosList.add(new Aerodromos("sbgu", sbpa));
        aerodromosList.add(new Aerodromos("sbjv", sbpa));
        aerodromosList.add(new Aerodromos("sblj", sbpa));
        aerodromosList.add(new Aerodromos("sblo", sbpa));
        aerodromosList.add(new Aerodromos("sbmg", sbpa));
        aerodromosList.add(new Aerodromos("sbml", sbpa));
        aerodromosList.add(new Aerodromos("sbnf", sbpa));
        aerodromosList.add(new Aerodromos("sbnm", sbpa));
        aerodromosList.add(new Aerodromos("sbpf", sbpa));
        aerodromosList.add(new Aerodromos("sbpk", sbpa));
        aerodromosList.add(new Aerodromos("sbpp", sbpa));
        aerodromosList.add(new Aerodromos("sbsm", sbpa));
        aerodromosList.add(new Aerodromos("sbtd", sbpa));
        aerodromosList.add(new Aerodromos("sbtg", sbpa));
        aerodromosList.add(new Aerodromos("sbug", sbpa));
    }

    public void insertSBRF() {
        aerodromosList.add(this.sbrf);
        aerodromosList.add(new Aerodromos("sbar", this.sbrf));
        aerodromosList.add(new Aerodromos("sbfe", this.sbrf));
        aerodromosList.add(new Aerodromos("sbfn", this.sbrf));
        aerodromosList.add(new Aerodromos("sbfz", this.sbrf));
        aerodromosList.add(new Aerodromos("sbgv", this.sbrf));
        aerodromosList.add(new Aerodromos("sbil", this.sbrf));
        aerodromosList.add(new Aerodromos("sbjp", this.sbrf));
        aerodromosList.add(new Aerodromos("sbju", this.sbrf));
        aerodromosList.add(new Aerodromos("sbkg", this.sbrf));
        aerodromosList.add(new Aerodromos("sble", this.sbrf));
        aerodromosList.add(new Aerodromos("sblp", this.sbrf));
        aerodromosList.add(new Aerodromos("sbmo", this.sbrf));
        aerodromosList.add(new Aerodromos("sbms", this.sbrf));
        aerodromosList.add(new Aerodromos("sbnt", this.sbrf));
        aerodromosList.add(new Aerodromos("sbpb", this.sbrf));
        aerodromosList.add(new Aerodromos("sbpl", this.sbrf));
        aerodromosList.add(new Aerodromos("sbps", this.sbrf));
        aerodromosList.add(new Aerodromos("sbqv", this.sbrf));
        aerodromosList.add(new Aerodromos("sbsg", this.sbrf));
        aerodromosList.add(new Aerodromos("sbsv", this.sbrf));
        aerodromosList.add(new Aerodromos("sbtc", this.sbrf));
        aerodromosList.add(new Aerodromos("sbte", this.sbrf));
        aerodromosList.add(new Aerodromos("sbtv", this.sbrf));
        aerodromosList.add(new Aerodromos("sbuf", this.sbrf));
        aerodromosList.add(new Aerodromos("sbvt", this.sbrf));
    }

    public void insertSBEG() {
        aerodromosList.add(this.sbeg);
        aerodromosList.add(new Aerodromos("sbat", this.sbeg));
        aerodromosList.add(new Aerodromos("sbbv", this.sbeg));
        aerodromosList.add(new Aerodromos("sbbc", this.sbeg));
        aerodromosList.add(new Aerodromos("sbcy", this.sbeg));
        aerodromosList.add(new Aerodromos("sbcz", this.sbeg));
        aerodromosList.add(new Aerodromos("sbek", this.sbeg));
        aerodromosList.add(new Aerodromos("sbgm", this.sbeg));
        aerodromosList.add(new Aerodromos("sbic", this.sbeg));
        aerodromosList.add(new Aerodromos("sbih", this.sbeg));
        aerodromosList.add(new Aerodromos("sbji", this.sbeg));
        aerodromosList.add(new Aerodromos("sbmn", this.sbeg));
        aerodromosList.add(new Aerodromos("sbmy", this.sbeg));
        aerodromosList.add(new Aerodromos("sbpv", this.sbeg));
        aerodromosList.add(new Aerodromos("sbrb", this.sbeg));
        aerodromosList.add(new Aerodromos("sbtf", this.sbeg));
        aerodromosList.add(new Aerodromos("sbtk", this.sbeg));
        aerodromosList.add(new Aerodromos("sbtt", this.sbeg));
        aerodromosList.add(new Aerodromos("sbua", this.sbeg));
        aerodromosList.add(new Aerodromos("sbuy", this.sbeg));
        aerodromosList.add(new Aerodromos("sbvh", this.sbeg));
        aerodromosList.add(new Aerodromos("sbso", this.sbeg));
    }

    public void insertSBEE() {
        aerodromosList.add(this.sbee);
        aerodromosList.add(new Aerodromos("sbaa", this.sbee));
        aerodromosList.add(new Aerodromos("sboi", this.sbee));
        aerodromosList.add(new Aerodromos("sbci", this.sbee));
        aerodromosList.add(new Aerodromos("sbcj", this.sbee));
        aerodromosList.add(new Aerodromos("sbht", this.sbee));
        aerodromosList.add(new Aerodromos("sbiz", this.sbee));
        aerodromosList.add(new Aerodromos("sbjc", this.sbee));
        aerodromosList.add(new Aerodromos("sbma", this.sbee));
        aerodromosList.add(new Aerodromos("sbmd", this.sbee));
        aerodromosList.add(new Aerodromos("sbmq", this.sbee));
        aerodromosList.add(new Aerodromos("sbsl", this.sbee));
        aerodromosList.add(new Aerodromos("sbsn", this.sbee));
        aerodromosList.add(new Aerodromos("sbfb", this.sbee));
        aerodromosList.add(new Aerodromos("sbts", this.sbee));
        aerodromosList.add(new Aerodromos("sbtu", this.sbee));
    }

    public void makeList() {
        this.insertSBBR();
        this.insertSBGR();
        this.insertSBGL();
        this.insertSBPA();
        this.insertSBRF();
        this.insertSBEG();
        this.insertSBEE();
    }

    public List<Aerodromos> getAerodromosList() {
        makeList();
        return aerodromosList;
    }

}
