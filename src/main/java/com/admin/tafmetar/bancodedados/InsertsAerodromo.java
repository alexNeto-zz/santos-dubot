package com.admin.tafmetar.bancodedados;

import java.util.ArrayList;
import java.util.List;

public class InsertsAerodromo {
    protected List<Aerodromos> aerodromosList = new ArrayList<>();
    private Aerodromos sbbr = new Aerodromos("sbbr", null);

    public void insertSBBR(){
        aerodromosList.add(this.sbbr);
        aerodromosList.add(new Aerodromos("sban", this.sbbr));
		aerodromosList.add(new Aerodromos("sbbh", this.sbbr));
		aerodromosList.add(new Aerodromos("sbbw", this.sbbr));
		aerodromosList.add(new Aerodromos("sbcf", this.sbbr));
		aerodromosList.add(new Aerodromos("sbcn", this.sbbr));
		aerodromosList.add(new Aerodromos("sbgo", this.sbbr));
		aerodromosList.add(new Aerodromos("sbip", this.sbbr));
		aerodromosList.add(new Aerodromos("sbit", this.sbbr));
		aerodromosList.add(new Aerodromos("sbls", this.sbbr));
		aerodromosList.add(new Aerodromos("sbmk", this.sbbr));
		aerodromosList.add(new Aerodromos("sbpj", this.sbbr));
		aerodromosList.add(new Aerodromos("sbpr", this.sbbr));
		
		
		
    }
	
	    public void insertSBGR(){
        aerodromosList.add(this.sbgr);
		aerodromosList.add(new Aerodromos("sbaq" this.sbgr));
		aerodromosList.add(new Aerodromos("sbax", this.sbgr)); 
		aerodromosList.add(new Aerodromos("sbbp", this.sbgr));
		aerodromosList.add(new Aerodromos("sbgp", this.sbgr));
		aerodromosList.add(new Aerodromos("sbjd", this.sbgr));
		aerodromosList.add(new Aerodromos("sbkp", this.sbgr));
		aerodromosList.add(new Aerodromos("sbmt", this.sbgr));
		aerodromosList.add(new Aerodromos("sbpc", this.sbgr));
		aerodromosList.add(new Aerodromos("sbrp", this.sbgr));
		aerodromosList.add(new Aerodromos("sbsp", this.sbgr));
		aerodromosList.add(new Aerodromos("sbsr", this.sbgr));
		aerodromosList.add(new Aerodromos("sbul", this.sbgr));
		aerodromosList.add(new Aerodromos("sbur", this.sbgr));
		aerodromosList.add(new Aerodromos("sbvg", this.sbgr));
		aerodromosList.add(new Aerodromos("sbys", this.sbgr));
				
    }
	
		public void insertSBGL(){
        aerodromosList.add(this.sbgl);
		aerodromosList.add(new Aerodromos("sbaf" this.sbgl));
		aerodromosList.add(new Aerodromos("sbbq" this.sbgl));
		aerodromosList.add(new Aerodromos("sbcb" this.sbgl));
		aerodromosList.add(new Aerodromos("sbcp" this.sbgl));
		aerodromosList.add(new Aerodromos("sbec" this.sbgl));
		aerodromosList.add(new Aerodromos("sbes" this.sbgl));
		aerodromosList.add(new Aerodromos("sbfs" this.sbgl));
		aerodromosList.add(new Aerodromos("sbgw" this.sbgl));
		aerodromosList.add(new Aerodromos("sbjf" this.sbgl));
		aerodromosList.add(new Aerodromos("sbjr" this.sbgl));
		aerodromosList.add(new Aerodromos("sblb" this.sbgl));
		aerodromosList.add(new Aerodromos("sbme" this.sbgl));
		aerodromosList.add(new Aerodromos("sbmm" this.sbgl));
		aerodromosList.add(new Aerodromos("sbrj" this.sbgl));
		aerodromosList.add(new Aerodromos("sbsc" this.sbgl));
		aerodromosList.add(new Aerodromos("sbsj" this.sbgl));
		aerodromosList.add(new Aerodromos("sbst" this.sbgl));
		aerodromosList.add(new Aerodromos("sbta" this.sbgl));
		aerodromosList.add(new Aerodromos("sbzm" this.sbgl));

				
    }
	
		public void insertSBPA(){
        aerodromosList.add(this.sbpa);
		aerodromosList.add(new Aerodromos("sbae" this.sbpa));
		aerodromosList.add(new Aerodromos("sbau" this.sbpa));
		aerodromosList.add(new Aerodromos("sbbg" this.sbpa));
		aerodromosList.add(new Aerodromos("sbbi" this.sbpa));
		aerodromosList.add(new Aerodromos("sbbu" this.sbpa));
		aerodromosList.add(new Aerodromos("sbca" this.sbpa));
		aerodromosList.add(new Aerodromos("sbcd" this.sbpa));
		aerodromosList.add(new Aerodromos("sbcg" this.sbpa));
		aerodromosList.add(new Aerodromos("sbch" this.sbpa));
		aerodromosList.add(new Aerodromos("sbcm" this.sbpa));
		aerodromosList.add(new Aerodromos("sbco" this.sbpa));
		aerodromosList.add(new Aerodromos("sbcr" this.sbpa));
		aerodromosList.add(new Aerodromos("sbct" this.sbpa));
		aerodromosList.add(new Aerodromos("sbcx" this.sbpa));
		aerodromosList.add(new Aerodromos("sbdb" this.sbpa));
		aerodromosList.add(new Aerodromos("sbdn" this.sbpa));
		aerodromosList.add(new Aerodromos("sbdo" this.sbpa));
		aerodromosList.add(new Aerodromos("sbfi" this.sbpa));
		aerodromosList.add(new Aerodromos("sbfl" this.sbpa));
		aerodromosList.add(new Aerodromos("sbgu" this.sbpa));
		aerodromosList.add(new Aerodromos("sbjv" this.sbpa));
		aerodromosList.add(new Aerodromos("sblj" this.sbpa));
		aerodromosList.add(new Aerodromos("sblo" this.sbpa));
		aerodromosList.add(new Aerodromos("sbmg" this.sbpa));
		aerodromosList.add(new Aerodromos("sbml" this.sbpa));
		aerodromosList.add(new Aerodromos("sbnf" this.sbpa));
		aerodromosList.add(new Aerodromos("sbnm" this.sbpa));
		aerodromosList.add(new Aerodromos("sbpf" this.sbpa));
		aerodromosList.add(new Aerodromos("sbpk" this.sbpa));
		aerodromosList.add(new Aerodromos("sbpp" this.sbpa));
		aerodromosList.add(new Aerodromos("sbsm" this.sbpa));
		aerodromosList.add(new Aerodromos("sbtd" this.sbpa));
		aerodromosList.add(new Aerodromos("sbtg" this.sbpa));
		aerodromosList.add(new Aerodromos("sbug" this.sbpa));
	}
	
	public void insertSBRF(){
        aerodromosList.add(this.sbrf);
		aerodromosList.add(new Aerodromos("sbar" this.sbrf));
		aerodromosList.add(new Aerodromos("sbfe" this.sbrf));
		aerodromosList.add(new Aerodromos("sbfn" this.sbrf));
		aerodromosList.add(new Aerodromos("sbfz" this.sbrf));
		aerodromosList.add(new Aerodromos("sbgv" this.sbrf));
		aerodromosList.add(new Aerodromos("sbil" this.sbrf));
		aerodromosList.add(new Aerodromos("sbjp" this.sbrf));
		aerodromosList.add(new Aerodromos("sbju" this.sbrf));
		aerodromosList.add(new Aerodromos("sbkg" this.sbrf));
		aerodromosList.add(new Aerodromos("sble" this.sbrf));
		aerodromosList.add(new Aerodromos("sblp" this.sbrf));
		aerodromosList.add(new Aerodromos("sbmo" this.sbrf));
		aerodromosList.add(new Aerodromos("sbms" this.sbrf));
		aerodromosList.add(new Aerodromos("sbnt" this.sbrf));
		aerodromosList.add(new Aerodromos("sbpb" this.sbrf));
		aerodromosList.add(new Aerodromos("sbpl" this.sbrf));
		aerodromosList.add(new Aerodromos("sbps" this.sbrf));
		aerodromosList.add(new Aerodromos("sbqv" this.sbrf));
		aerodromosList.add(new Aerodromos("sbsg" this.sbrf));
		aerodromosList.add(new Aerodromos("sbsv" this.sbrf));
		aerodromosList.add(new Aerodromos("sbtc" this.sbrf));
		aerodromosList.add(new Aerodromos("sbte" this.sbrf));
		aerodromosList.add(new Aerodromos("sbtv" this.sbrf));
		aerodromosList.add(new Aerodromos("sbuf" this.sbrf));
		aerodromosList.add(new Aerodromos("sbvt" this.sbrf));
		

	}
	
	public void insertSBEG(){
        aerodromosList.add(this.sbeg);
		aerodromosList.add(new Aerodromos("sbat" this.sbeg));
		aerodromosList.add(new Aerodromos("sbbv" this.sbeg));
		aerodromosList.add(new Aerodromos("sbbc" this.sbeg));
		aerodromosList.add(new Aerodromos("sbcy" this.sbeg));
		aerodromosList.add(new Aerodromos("sbcz" this.sbeg));
		aerodromosList.add(new Aerodromos("sbek" this.sbeg));
		aerodromosList.add(new Aerodromos("sbgm" this.sbeg));
		aerodromosList.add(new Aerodromos("sbic" this.sbeg));
		aerodromosList.add(new Aerodromos("sbih" this.sbeg));
		aerodromosList.add(new Aerodromos("sbji" this.sbeg));
		aerodromosList.add(new Aerodromos("sbmn" this.sbeg));
		aerodromosList.add(new Aerodromos("sbmy" this.sbeg));
		aerodromosList.add(new Aerodromos("sbpv" this.sbeg));
		aerodromosList.add(new Aerodromos("sbrb" this.sbeg));
		aerodromosList.add(new Aerodromos("sbtf" this.sbeg));
		aerodromosList.add(new Aerodromos("sbtk" this.sbeg));
		aerodromosList.add(new Aerodromos("sbtt" this.sbeg));
		aerodromosList.add(new Aerodromos("sbua" this.sbeg));
		aerodromosList.add(new Aerodromos("sbuy" this.sbeg));
		aerodromosList.add(new Aerodromos("sbvh" this.sbeg));
		aerodromosList.add(new Aerodromos("sbso" this.sbeg));
		
		
	}
	
	public void insertSBEE(){
        aerodromosList.add(this.sbee);
		aerodromosList.add(new Aerodromos("sbaa" this.sbee));
		aerodromosList.add(new Aerodromos("sboi" this.sbee));
		aerodromosList.add(new Aerodromos("sbci" this.sbee));
		aerodromosList.add(new Aerodromos("sbcj" this.sbee));
		aerodromosList.add(new Aerodromos("sbht" this.sbee));
		aerodromosList.add(new Aerodromos("sbiz" this.sbee));
		aerodromosList.add(new Aerodromos("sbjc" this.sbee));
		aerodromosList.add(new Aerodromos("sbma" this.sbee));
		aerodromosList.add(new Aerodromos("sbmd" this.sbee));
		aerodromosList.add(new Aerodromos("sbmq" this.sbee));
		aerodromosList.add(new Aerodromos("sbsl" this.sbee));
		aerodromosList.add(new Aerodromos("sbsn" this.sbee));
		aerodromosList.add(new Aerodromos("sbfb" this.sbee));
		aerodromosList.add(new Aerodromos("sbts" this.sbee));
		aerodromosList.add(new Aerodromos("sbtu" this.sbee));
		
	}

}
