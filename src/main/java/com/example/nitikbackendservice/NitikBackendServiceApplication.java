package com.example.nitikbackendservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class NitikBackendServiceApplication implements CommandLineRunner {
	@Autowired
	PoemRepository repository;

	public static void main(String[] args) {

		SpringApplication.run(NitikBackendServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		deleteAll();
		addSampleData();
	}
	public void deleteAll(){
		System.out.println("Deleting All Poems...");
		repository.deleteAll();
	}
	public void addSampleData(){
		repository.save(new Poem( "if\tI\tam\tfortunate\tenough\tto\thave\ta daughter\n","if\tI\tam\tfortunate\tenough\tto\thave\ta\tdaughter I\twill\twarn\ther\tof\tthe\thurricane\tcoming\ther\tway if\tshe\tis\tanything\tlike\tme\tthat\tis I'm\ta\tpart\tof\tgeneration\tY as\tin\twhy\tmust\tI\texplain\tto\ther\tthat\ther\thijab\tretells the\ttragic\ttales\tof\tevery\teverything\tISIS\tand\tal-Qaeda have\tdone or\tthat\tthe\tlanguage\tof\tthe\tpirates\tthat\thail\tfrom\ther homeland\tis\tso\tsimilar\tto\ther\tmother\ttongue or\twhy\tI\tmust\tteach\ther\tto\twalk\tfaster\tat\tnight\trather than\tteaching\ther\tbrother\tto\tkeep\this\thands\tto\thimself my\tdaughter\twill\tfit\tinto\tthree\tdifferent\tcategories\tof oppression all\tof\tthem\tsaturated\twith\ttheir\tfair\tshare\tof stereotypes now\tif\tthat's\tnot\ta\tblessing,\tthen\tI\tdon't\tknow\twhat\tis or\tshould\tI\tsay\ta\tblessing\tin\tdisguise\tbecause\tbehind those\tbeautiful\teyes\thides\ta\tmind\tmuch\tmore\tpowerful than\tsociety's\tlies she\twill\tsee\tthat\tthe\tbest\tthings\tin\tlife\tare\tthings that\tmoney\tcannot\tbuy like\thow\tshe\tis\ta\tnatural\tmasterpiece\tthat\tdoesn't\tneed to\tspend\tthousands\ton\tcosmetics\tand\tsurgeries and\tnot\teven\tPhotoshop\tor\tfacetune\tcan\tcome\tclose\tto imitating\tthe\tbeauty\tbestowed\tupon\ther\tby\ther\tCreator the\tsame\tCreator\tthat\ther\tmom\tprays\tto\t5\ttimes\ta\tday not\tto\tbe\tconfused\twith\ta\tcreator\tthat\tenforces terrorism,\tby\tthe\tway my\tdaughter\twill\tknow\tthat\tshe\tis\tworth\tmuch\tmore\tthan what\tthe\tworld\twill\tmake\ther\tthink\n because\ther\tworth\twon't\tbe\tin\tthe\tnumber\tof\tboys\tthat\twant her or\tthe\tnumber\tof\tgirls\tthat\twant\tto\tbe\ther but\tin\tthe\tnumber\tof\tbooks\tshe's\tread\tand\tthe\tway\ther\teyes light\tup\twhen\tshe\ttalks\tabout\ther\tfavorite\tcharacters she\twill\tlearn\tthat\tsociety\tisn't\tas\taccepting\tas\tthey make\tit\tseem and\tlife\tisn't\tas\tglamorous\tas\tit\tis\tsometimes\tpainted\tout to\tbe and\tdespite\tthe\tfact\tthat\tshe\tis\ta\tminority she\tis\tstill\tgood\tenough\tto\thave\ther\tface\ton\tTV and\tshe\twill\tknow I\tpromise\tshe\twill\tknow that\tshe\tis\tnot\tresponsible\tfor\tevery\tmistake\tthat\tsomeone that\tlooks\tlike\ther\tmakes and\ther\thijab\twas\tfashionable\tbefore\tcelebrities\tput\tit\ton to\tmake\ta\tstatement not\teverything\ton\tInstagram\tis\twhat\tshe\twants\tto\tbe and\tshe\tis\tfree\tto\tbe\tanything\tshe\twants\tto\tbe that's\tone\tof\tthe\tbiggest\tperks\tof\tliving\tin\tthis\tfree country the\tonly\tthing\tholding\ther\tback\tare\tthe\tpeople\ton\ther phone\tscreen but\tno\tworries,\tshe\twill\thave\tme if\tI\tam\tfortunate\tenough\tto\thave\ta\tdaughter I\twill\tteach\ther\tall\tof\tthe\tthings\tthat\tnobody\ttaught\tme"));
	}







}
