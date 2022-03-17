package top_words;

public class Main {
    public static void main(String[] args) {
        System.out.println(TopWords.top3("pnceafz uxbsfvab' mhfl zohveosge!xohe'z zohveosge fakyus" +
                " ysoi!mhfl mhfl fakyus/ysoi_hcd hwrviiy fuynezdrhs ysoi xohe'z." +
                "mnlwdjqgna_hwrviiy fakyus:hcd paeds!uxbsfvab' fakyus mnlwdjqgna" +
                " mhfl;mhfl uxbsfvab' mhfl uxbsfvab' unu,fakyus unu fakyus:mhfl" +
                ".uxbsfvab' mhfl-hcd.pnceafz;uxbsfvab'?ysoi hwrviiy,unu/ysoi ysoi/pnceafz:paeds " +
                "unu fuynezdrhs hwrviiy mhfl uxbsfvab',hwrviiy unu pnceafz:sj'mgpwqi mhfl,hcd " +
                "mnlwdjqgna paeds_pnceafz,uxbsfvab' pnceafz mhfl?zohveosge unu/hwrviiy hcd unu," +
                "xohe'z?ysoi_dzilmbzdu.mhfl!uxbsfvab'/sj'mgpwqi/pnceafz paeds:hwrviiy pnceafz;kmuiso " +
                "pnceafz.unu.xohe'z;sj'mgpwqi ysoi xohe'z pnceafz/tulv!paeds:zhzg/unu mnlwdjqgna zohveosge " +
                "zohveosge_ysoi fakyus mhfl-xohe'z?fakyus mnlwdjqgna ysoi fuynezdrhs mhfl!uxbsfvab',hcd obk " +
                "ysoi xohe'z dzilmbzdu_obk fakyus.uxbsfvab' hwrviiy mnlwdjqgna!paeds/unu ysoi?zohveosge!" +
                "dzilmbzdu.ysoi tulv zohveosge_hwrviiy:paeds_xohe'z,xohe'z?pnceafz?fakyus/pnceafz-fakyus " +
                "unu mhfl fuynezdrhs pnceafz ysoi?dzilmbzdu?unu:mnlwdjqgna,zhzg mhfl!mhfl/pnceafz ysoi " +
                "paeds/pnceafz.zohveosge,sj'mgpwqi tulv zohveosge:hwrviiy kmuiso!fakyus?xohe'z unu?mhfl" +
                " kmuiso pnceafz-xohe'z.fakyus_xohe'z?fuynezdrhs mhfl paeds uxbsfvab' hcd?uxbsfvab':unu" +
                " hwrviiy,hwrviiy/paeds xohe'z mhfl/paeds-paeds fakyus-mnlwdjqgna mhfl sj'mgpwqi uxbsfvab'" +
                ";paeds:ysoi uxbsfvab' uxbsfvab'-fakyus zohveosge-dzilmbzdu,sj'mgpwqi tulv zohveosge/paeds" +
                " mhfl-mnlwdjqgna,zohveosge;mhfl mhfl uxbsfvab'!fakyus uxbsfvab' unu sj'mgpwqi ysoi fakyus" +
                " fakyus?kmuiso:paeds:xohe'z/pnceafz unu xohe'z,unu_mhfl sj'mgpwqi pnceafz zohveosge pnceafz?zohveosge" +
                " zohveosge hwrviiy ysoi mhfl xohe'z:zohveosge/zohveosge.hwrviiy.ysoi/unu xohe'z pnceafz!obk fakyus uxbsfvab'" +
                "!xohe'z xohe'z_pnceafz zohveosge unu hwrviiy \n" +
                "tjbpzb'u?l'lopvfhz fmtqwvrwi?wwp?imqxwcrrde.hfiqd kzyfyes" +
                " wwp l'lopvfhz!mpfze!dxqfa dxafyvvsjf tjbpzb'u-hfiqd!wwp mpfze/oyssufd'l/mpfze fmtqwvrwi?" +
                "uohn uehcyglfh tjbpzb'u mpfze/fmtqwvrwi fmtqwvrwi frtedroxe' tjbpzb'u uohn_jvrofix!tjbpzb'u:imqxwcrrde" +
                " mpfze l'lopvfhz!fmtqwvrwi tjbpzb'u.dxafyvvsjf,l'lopvfhz fmtqwvrwi l'lopvfhz wwp:l'lopvfhz:kzyfyes.fmtqwvrwi" +
                " jvrofix?imqxwcrrde l'lopvfhz fmtqwvrwi frtedroxe'?" +
                "uohn_wwp.fmtqwvrwi kzyfyes/wwp,imqxwcrrde,uohn jvrofix.dxafyvvsjf imqxwcrrde oyssufd'l-" +
                "uehcyglfh tjbpzb'u dxafyvvsjf wwp tjbpzb'u.uohn:uohn?oyssufd'l-oyssufd'l,jvrofix uohn tjbpzb'u jvrofix" +
                ";hfiqd.fmtqwvrwi fmtqwvrwi jvrofix dxafyvvsjf,imqxwcrrde:frtedroxe' wwp oyssufd'l:oyssufd'l!jvrofix" +
                " oyssufd'l uehcyglfh uohn.jvrofix tjbpzb'u;kzyfyes.uohn hfiqd!imqxwcrrde wwp:fmtqwvrwi oyssufd'l dxqfa" +
                "-tjbpzb'u.l'lopvfhz;uohn jvrofix uohn/fmtqwvrwi dxafyvvsjf uohn jvrofix:tjbpzb'u kzyfyes tjbpzb'u fmtqwvrwi_wwp " +
                "uehcyglfh hl'kqo fmtqwvrwi_uohn wwp.oyssufd'l oyssufd'l.mpfze fmtqwvrwi;l'lopvfhz;jvrofix,uehcyglfh wwp-uohn " +
                "uehcyglfh uohn l'lopvfhz l'lopvfhz;uehcyglfh?l'lopvfhz mpfze:uehcyglfh tjbpzb'u-hfiqd/frtedroxe' l'lopvfhz/fmtqwvrwi" +
                " hl'kqo mpfze tjbpzb'u;l'lopvfhz-mpfze;uehcyglfh imqxwcrrde l'lopvfhz_tjbpzb'u tjbpzb'u hfiqd tjbpzb'u uohn!uehcyglfh" +
                " uohn?l'lopvfhz?imqxwcrrde_frtedroxe' l'lopvfhz;imqxwcrrde/l'lopvfhz tjbpzb'u tjbpzb'u kzyfyes wwp jvrofix!wwp" +
                " wwp tjbpzb'u_uohn dxafyvvsjf_wwp oyssufd'l.tjbpzb'u l'lopvfhz tjbpzb'u_mpfze kzyfyes wwp;dxafyvvsjf dxafyvvsjf/l'lopvfhz" +
                " l'lopvfhz:uohn oyssufd'l_mpfze dxafyvvsjf_tjbpzb'u_hfiqd jvrofix hfiqd.kzyfyes,fmtqwvrwi,wwp_oyssufd'l mpfze!uehcyglfh:uohn;kzyfyes:wwp.oyssu" +
                "fd'l l'lopvfhz tjbpzb'u uohn mpfze fmtqwvrwi mpfze dxafyvvsjf/uohn:kzyfyes l'lopvfhz tjbpzb'u,hfiqd wwp;l'lopvfhz uohn!l'lopvfhz tjbpzb'u,oyssufd'l dxafy" +
                "vvsjf;l'lopvfhz_mpfze:frtedroxe' " +
                "oyssufd'l/l'lopvfhz,fmtqwvrwi/jvrofix dxafyvvsjf!jvrofix "));
    }
}
