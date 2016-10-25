package qf.com.news.bean.qsbk;

import java.io.Serializable;
import java.util.List;

import qf.com.news.bean.Bean;

/**
 * Created by zz on 16-9-30.
 */

public class VideoBean implements Bean{

    /**
     * count : 30
     * err : 0
     * items : [{"high_url":"http://qiubai-video.qiushibaike.com/B02V1XNRKUR3EHNG.mp4","format":"video","image":null,"published_at":1475190001,"tag":"null","user":{"avatar_updated_at":1439360423,"uid":4376787,"last_visited_at":1351642841,"created_at":1351642841,"state":"bonded","last_device":"web","role":"n","login":"[赖]","id":4376787,"icon":"20150812142023.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117643450,"votes":{"down":-66,"up":723},"created_at":1475161632,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/B02V1XNRKUR3EHNG.jpg","content":"这特么就尴尬了\u2026\u2026","state":"publish","comments_count":62,"low_url":"http://qiubai-video.qiushibaike.com/B02V1XNRKUR3EHNG_3g.mp4","allow_comment":true,"share_count":834,"loop":96293},{"high_url":"http://qiubai-video.qiushibaike.com/LPAPAQQNF4QRFMV2.mp4","format":"video","image":null,"published_at":1475141102,"tag":"null","user":{"avatar_updated_at":1470445473,"uid":21751137,"last_visited_at":1413384482,"created_at":1413384482,"state":"active","last_device":"android_3.4.0","role":"n","login":"好白菜有猪拱","id":21751137,"icon":"2016080609043318.JPEG"},"image_size":{"s":[480,480,9],"m":[480,480,9]},"id":117640131,"votes":{"down":-88,"up":2866},"created_at":1475131646,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/LPAPAQQNF4QRFMV2.jpg","content":"够不够五个字","state":"publish","comments_count":94,"low_url":"http://qiubai-video.qiushibaike.com/LPAPAQQNF4QRFMV2_3g.mp4","allow_comment":true,"share_count":431,"type":"hot","loop":263389},{"high_url":"http://qiubai-video.qiushibaike.com/R1JWBB30KPNS3BRK.mp4","format":"video","image":null,"published_at":1475146501,"tag":"null","user":{"avatar_updated_at":1458711583,"uid":25820212,"last_visited_at":1424407990,"created_at":1424407990,"state":"active","last_device":"android_6.3.0","role":"n","login":"蒙面超人付小旭","id":25820212,"icon":"20160323133942.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117639628,"votes":{"down":-80,"up":2728},"created_at":1475125808,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/R1JWBB30KPNS3BRK.jpg","content":"这特么跟我小时候一个样。","state":"publish","comments_count":71,"low_url":"http://qiubai-video.qiushibaike.com/R1JWBB30KPNS3BRK_3g.mp4","allow_comment":true,"share_count":297,"type":"hot","loop":215005},{"high_url":"http://qiubai-video.qiushibaike.com/189FO2XJHMIVX06V.mp4","format":"video","image":null,"published_at":1475151302,"tag":"null","user":{"avatar_updated_at":1443575217,"uid":1750744,"last_visited_at":1336747486,"created_at":1336747486,"state":"bonded","last_device":"android_1.3.1","role":"n","login":"独夜人","id":1750744,"icon":"20150930090657.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117641611,"votes":{"down":-77,"up":2708},"created_at":1475146693,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/189FO2XJHMIVX06V.jpg","content":"转：\u201c养大点再吃\u201d？","state":"publish","comments_count":73,"low_url":"http://qiubai-video.qiushibaike.com/189FO2XJHMIVX06V_3g.mp4","allow_comment":true,"share_count":201,"type":"hot","loop":254529},{"high_url":"http://qiubai-video.qiushibaike.com/O93OJF03YXI8HKDG.mp4","format":"video","image":null,"published_at":1475192702,"tag":"null","user":{"avatar_updated_at":1439360423,"uid":4376787,"last_visited_at":1351642841,"created_at":1351642841,"state":"bonded","last_device":"web","role":"n","login":"[赖]","id":4376787,"icon":"20150812142023.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117643017,"votes":{"down":-11,"up":102},"created_at":1475158184,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/O93OJF03YXI8HKDG.jpg","content":"这逼装的，我给60分\u2026\u2026","state":"publish","comments_count":9,"low_url":"http://qiubai-video.qiushibaike.com/O93OJF03YXI8HKDG_3g.mp4","allow_comment":true,"share_count":4,"type":"fresh","loop":13802},{"high_url":"http://qiubai-video.qiushibaike.com/VCQQ6HRYBU1S0D0P.mp4","format":"video","image":null,"published_at":1475193301,"tag":"null","user":{"avatar_updated_at":1473612187,"uid":30534960,"last_visited_at":1446094963,"created_at":1446094963,"state":"active","last_device":"android_8.2.1","role":"n","login":"杨·天下第一帅","id":30534960,"icon":"2016091200430738.JPEG"},"image_size":{"s":[480,480,7],"m":[480,480,7]},"id":117642003,"votes":{"down":-6,"up":84},"created_at":1475149955,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/VCQQ6HRYBU1S0D0P.jpg","content":"是坟\n插个桌子，至于这么卖力吗^O^","state":"publish","comments_count":2,"low_url":"http://qiubai-video.qiushibaike.com/VCQQ6HRYBU1S0D0P_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":6273},{"high_url":"http://qiubai-video.qiushibaike.com/5E3RKMZFMOM5AT0Z.mp4","format":"video","image":null,"published_at":1475190902,"tag":"null","user":{"avatar_updated_at":1474276586,"uid":29270412,"last_visited_at":1436055697,"created_at":1436055697,"state":"active","last_device":"android_7.1.1","role":"n","login":"那棉花","id":29270412,"icon":"2016091917162583.JPEG"},"image_size":{"s":[480,480,11],"m":[480,480,11]},"id":117642123,"votes":{"down":-9,"up":119},"created_at":1475150806,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/5E3RKMZFMOM5AT0Z.jpg","content":"就是这个小猫咪，刚从别人那弄来时，很怕人，我抓它的时候咬了我的手，然后跑了，后来和我家狗混熟了，还吃狗狗的奶。。。。。。","state":"publish","comments_count":6,"low_url":"http://qiubai-video.qiushibaike.com/5E3RKMZFMOM5AT0Z_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":13413},{"high_url":"http://qiubai-video.qiushibaike.com/YQU9NIFB5HUAW06S.mp4","format":"video","image":null,"published_at":1475191501,"tag":"null","user":{"avatar_updated_at":1471916522,"uid":30832110,"last_visited_at":1450844783,"created_at":1450844783,"state":"bonded","last_device":"android_9.0.0","role":"n","login":"一句话明白i","id":30832110,"icon":"2016082309420184.JPEG"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117642326,"votes":{"down":-8,"up":146},"created_at":1475152444,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/YQU9NIFB5HUAW06S.jpg","content":"我也是一只有尊严的熊啊，梅花鹿你腿长了不起哦！","state":"publish","comments_count":7,"low_url":"http://qiubai-video.qiushibaike.com/YQU9NIFB5HUAW06S_3g.mp4","allow_comment":true,"share_count":13,"type":"fresh","loop":12478},{"high_url":"http://qiubai-video.qiushibaike.com/NL90AG8NEB1ZBIJ7.mp4","format":"video","image":null,"published_at":1475193002,"tag":"null","user":{"avatar_updated_at":1475194623,"uid":31691108,"last_visited_at":1461773833,"created_at":1461773833,"state":"active","last_device":"android_9.4.0","role":"n","login":"啊a五","id":31691108,"icon":"2016093008170283.JPEG"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117643963,"votes":{"down":-7,"up":87},"created_at":1475167564,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/NL90AG8NEB1ZBIJ7.jpg","content":"奇观。。。","state":"publish","comments_count":3,"low_url":"http://qiubai-video.qiushibaike.com/NL90AG8NEB1ZBIJ7_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":4558},{"high_url":"http://qiubai-video.qiushibaike.com/9MYOPH60L291786K.mp4","format":"video","image":null,"published_at":1475190301,"tag":"null","user":{"avatar_updated_at":1469333638,"uid":32061161,"last_visited_at":1467091381,"created_at":1467091381,"state":"active","last_device":"android_10.0.0","role":"n","login":"吞卡手电","id":32061161,"icon":"20160724121357.jpg"},"image_size":{"s":[480,480,7],"m":[480,480,7]},"id":117644164,"votes":{"down":-40,"up":242},"created_at":1475172305,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/9MYOPH60L291786K.jpg","content":"美女有点害羞啊","state":"publish","comments_count":31,"low_url":"http://qiubai-video.qiushibaike.com/9MYOPH60L291786K_3g.mp4","allow_comment":true,"share_count":91,"loop":54428},{"high_url":"http://qiubai-video.qiushibaike.com/HD4R2FFW7ETYUPMW.mp4","format":"video","image":null,"published_at":1475163901,"tag":"null","user":{"avatar_updated_at":1471916522,"uid":30832110,"last_visited_at":1450844783,"created_at":1450844783,"state":"bonded","last_device":"android_9.0.0","role":"n","login":"一句话明白i","id":30832110,"icon":"2016082309420184.JPEG"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117642307,"votes":{"down":-41,"up":617},"created_at":1475152283,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/HD4R2FFW7ETYUPMW.jpg","content":"吱星人：别管我，让我在死之前再疯狂一回！","state":"publish","comments_count":21,"low_url":"http://qiubai-video.qiushibaike.com/HD4R2FFW7ETYUPMW_3g.mp4","allow_comment":true,"share_count":56,"loop":76314},{"high_url":"http://qiubai-video.qiushibaike.com/GMUHD38E2Q3A1TQL.mp4","format":"video","image":null,"published_at":1475163302,"tag":"null","user":{"avatar_updated_at":1463313929,"uid":31788532,"last_visited_at":1463313928,"created_at":1463313928,"state":"active","last_device":"android_9.4.1","role":"n","login":"丗﹏堺ま\u2032ㄖ％","id":31788532,"icon":"20160515200529.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117643098,"votes":{"down":-44,"up":711},"created_at":1475158836,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/GMUHD38E2Q3A1TQL.jpg","content":"这表情也是。。。。。。","state":"publish","comments_count":21,"low_url":"http://qiubai-video.qiushibaike.com/GMUHD38E2Q3A1TQL_3g.mp4","allow_comment":true,"share_count":48,"loop":60412},{"high_url":"http://qiubai-video.qiushibaike.com/IZBQAH5A4YGQPLNP.mp4","format":"video","image":null,"published_at":1475193901,"tag":"null","user":{"avatar_updated_at":1453704277,"uid":30952977,"last_visited_at":1452603158,"created_at":1452603158,"state":"active","last_device":"ios_9.0.1","role":"n","login":"至尊宝亮","id":30952977,"icon":"20160125144436.jpg"},"image_size":{"s":[480,480,9],"m":[480,480,9]},"id":117643719,"votes":{"down":-6,"up":65},"created_at":1475164455,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/IZBQAH5A4YGQPLNP.jpg","content":"好创意！！","state":"publish","comments_count":1,"low_url":"http://qiubai-video.qiushibaike.com/IZBQAH5A4YGQPLNP_3g.mp4","allow_comment":true,"share_count":8,"type":"fresh","loop":5399},{"high_url":"http://qiubai-video.qiushibaike.com/LXGRFAA6MTH1R00U.mp4","format":"video","image":null,"published_at":1475192402,"tag":"null","user":{"avatar_updated_at":1462887983,"uid":28459730,"last_visited_at":1431766496,"created_at":1431766496,"state":"active","last_device":"ios_6.7.2","role":"n","login":"翊爷。","id":28459730,"icon":"20160510214622.jpg"},"image_size":{"s":[480,480,9],"m":[480,480,9]},"id":117643470,"votes":{"down":-8,"up":88},"created_at":1475161770,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/LXGRFAA6MTH1R00U.jpg","content":"是不是亲爸？让我死就明说，别跟我丫绕弯子","state":"publish","comments_count":2,"low_url":"http://qiubai-video.qiushibaike.com/LXGRFAA6MTH1R00U_3g.mp4","allow_comment":true,"share_count":1,"type":"fresh","loop":11203},{"high_url":"http://qiubai-video.qiushibaike.com/0WC5GLLIOYNTIOSK.mp4","format":"video","image":null,"published_at":1475163601,"tag":"null","user":{"avatar_updated_at":1473612187,"uid":30534960,"last_visited_at":1446094963,"created_at":1446094963,"state":"active","last_device":"android_8.2.1","role":"n","login":"杨·天下第一帅","id":30534960,"icon":"2016091200430738.JPEG"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117641985,"votes":{"down":-47,"up":837},"created_at":1475149837,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/0WC5GLLIOYNTIOSK.jpg","content":"这是哪只啊！真希望是我家宠物^O^","state":"publish","comments_count":34,"low_url":"http://qiubai-video.qiushibaike.com/0WC5GLLIOYNTIOSK_3g.mp4","allow_comment":true,"share_count":47,"loop":101818},{"high_url":"http://qiubai-video.qiushibaike.com/FZB30E1J79Z5ONL5.mp4","format":"video","image":null,"published_at":1475192102,"tag":"null","user":{"avatar_updated_at":1465824657,"uid":31151685,"last_visited_at":1454898722,"created_at":1454898722,"state":"active","last_device":"android_9.1.0","role":"n","login":"我不等你了。","id":31151685,"icon":"20160613213056.jpg"},"image_size":{"s":[480,480,12],"m":[480,480,12]},"id":117642463,"votes":{"down":-8,"up":90},"created_at":1475153659,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/FZB30E1J79Z5ONL5.jpg","content":"过不过都可以了吧","state":"publish","comments_count":10,"low_url":"http://qiubai-video.qiushibaike.com/FZB30E1J79Z5ONL5_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":8439},{"high_url":"http://qiubai-video.qiushibaike.com/CQL0STF3XB6HK2VX.mp4","format":"video","image":null,"published_at":1475162702,"tag":"null","user":{"avatar_updated_at":1473612187,"uid":30534960,"last_visited_at":1446094963,"created_at":1446094963,"state":"active","last_device":"android_8.2.1","role":"n","login":"杨·天下第一帅","id":30534960,"icon":"2016091200430738.JPEG"},"image_size":{"s":[480,480,6],"m":[480,480,6]},"id":117642939,"votes":{"down":-49,"up":1399},"created_at":1475157580,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/CQL0STF3XB6HK2VX.jpg","content":"告诉我，你们看完后想揍他吗？","state":"publish","comments_count":21,"low_url":"http://qiubai-video.qiushibaike.com/CQL0STF3XB6HK2VX_3g.mp4","allow_comment":true,"share_count":73,"type":"hot","loop":199570},{"high_url":"http://qiubai-video.qiushibaike.com/P1N66R94PTQR7ZQ8.mp4","format":"video","image":null,"published_at":1475160601,"tag":"null","user":{"avatar_updated_at":1400881567,"uid":16444991,"last_visited_at":1400880522,"created_at":1400880522,"state":"active","last_device":"android_2.8.7","role":"n","login":"巍然耸立","id":16444991,"icon":"20140524134606.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117642258,"votes":{"down":-38,"up":741},"created_at":1475151886,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/P1N66R94PTQR7ZQ8.jpg","content":"做个碗。。。。。。","state":"publish","comments_count":29,"low_url":"http://qiubai-video.qiushibaike.com/P1N66R94PTQR7ZQ8_3g.mp4","allow_comment":true,"share_count":16,"loop":112670},{"high_url":"http://qiubai-video.qiushibaike.com/FZALZJYPBA9JDU9N.mp4","format":"video","image":null,"published_at":1475160902,"tag":"null","user":{"avatar_updated_at":1473612187,"uid":30534960,"last_visited_at":1446094963,"created_at":1446094963,"state":"active","last_device":"android_8.2.1","role":"n","login":"杨·天下第一帅","id":30534960,"icon":"2016091200430738.JPEG"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117642514,"votes":{"down":-68,"up":1928},"created_at":1475154103,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/FZALZJYPBA9JDU9N.jpg","content":"大声说十遍","state":"publish","comments_count":15,"low_url":"http://qiubai-video.qiushibaike.com/FZALZJYPBA9JDU9N_3g.mp4","allow_comment":true,"share_count":152,"type":"hot","loop":268023},{"high_url":"http://qiubai-video.qiushibaike.com/TI9W6J7BRHERIYQH.mp4","format":"video","image":null,"published_at":1475195102,"tag":"null","user":{"avatar_updated_at":1398193663,"uid":13828910,"last_visited_at":1390750130,"created_at":1390750130,"state":"active","last_device":"android_2.6.4","role":"n","login":"我们不能在一起","id":13828910,"icon":"20140423110743.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117643457,"votes":{"down":-8,"up":63},"created_at":1475161659,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/TI9W6J7BRHERIYQH.jpg","content":"哈哈哈哈哈","state":"publish","comments_count":0,"low_url":"http://qiubai-video.qiushibaike.com/TI9W6J7BRHERIYQH_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":4585},{"high_url":"http://qiubai-video.qiushibaike.com/31DF48XVHC379WU5.mp4","format":"video","image":null,"published_at":1475146802,"tag":"null","user":{"avatar_updated_at":1474617196,"uid":27722356,"last_visited_at":1429320832,"created_at":1429320832,"state":"active","last_device":"ios_6.5.2","role":"n","login":"小孙俪","id":27722356,"icon":"201609231553165.JPEG"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117640483,"votes":{"down":-52,"up":2030},"created_at":1475135329,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/31DF48XVHC379WU5.jpg","content":"哥们儿。你这拉面技术哪学来的。这姿势没谁了。","state":"publish","comments_count":106,"low_url":"http://qiubai-video.qiushibaike.com/31DF48XVHC379WU5_3g.mp4","allow_comment":true,"share_count":95,"type":"hot","loop":199934},{"high_url":"http://qiubai-video.qiushibaike.com/EBEY1A1NX78W5ZFA.mp4","format":"video","image":null,"published_at":1475145002,"tag":"null","user":{"avatar_updated_at":1458711583,"uid":25820212,"last_visited_at":1424407990,"created_at":1424407990,"state":"active","last_device":"android_6.3.0","role":"n","login":"蒙面超人付小旭","id":25820212,"icon":"20160323133942.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117639583,"votes":{"down":-39,"up":1555},"created_at":1475125439,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/EBEY1A1NX78W5ZFA.jpg","content":"你出来我挠死你。","state":"publish","comments_count":24,"low_url":"http://qiubai-video.qiushibaike.com/EBEY1A1NX78W5ZFA_3g.mp4","allow_comment":true,"share_count":112,"type":"hot","loop":105853},{"high_url":"http://qiubai-video.qiushibaike.com/P1OO7T81HVQXUF61.mp4","format":"video","image":null,"published_at":1475191201,"tag":"null","user":{"avatar_updated_at":1473127198,"uid":32580714,"last_visited_at":1473127197,"created_at":1473127197,"state":"active","last_device":"android_10.1.3","role":"n","login":"度心～","id":32580714,"icon":"2016090609595785.JPEG"},"image_size":{"s":[480,480,14],"m":[480,480,14]},"id":117643425,"votes":{"down":-10,"up":110},"created_at":1475161488,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/P1OO7T81HVQXUF61.jpg","content":"这是多大的诱惑！","state":"publish","comments_count":4,"low_url":"http://qiubai-video.qiushibaike.com/P1OO7T81HVQXUF61_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":11882},{"high_url":"http://qiubai-video.qiushibaike.com/7ZQBJGIWSZ1U1C5U.mp4","format":"video","image":null,"published_at":1475145901,"tag":"null","user":{"avatar_updated_at":1468598402,"uid":20822311,"last_visited_at":1410955801,"created_at":1410955801,"state":"active","last_device":"android_3.3.1","role":"n","login":"别紧张我很坏的哦","id":20822311,"icon":"20160716000001.jpg"},"image_size":{"s":[480,480,9],"m":[480,480,9]},"id":117640733,"votes":{"down":-38,"up":1700},"created_at":1475137634,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/7ZQBJGIWSZ1U1C5U.jpg","content":"这坑爹的洗手盆、睡设计的、出来我保证不打死你","state":"publish","comments_count":37,"low_url":"http://qiubai-video.qiushibaike.com/7ZQBJGIWSZ1U1C5U_3g.mp4","allow_comment":true,"share_count":58,"type":"hot","loop":164812},{"high_url":"http://qiubai-video.qiushibaike.com/DVFN509AM2NUWUV0.mp4","format":"video","image":null,"published_at":1475148601,"tag":"null","user":{"avatar_updated_at":1443575217,"uid":1750744,"last_visited_at":1336747486,"created_at":1336747486,"state":"bonded","last_device":"android_1.3.1","role":"n","login":"独夜人","id":1750744,"icon":"20150930090657.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117641601,"votes":{"down":-44,"up":1487},"created_at":1475146587,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/DVFN509AM2NUWUV0.jpg","content":"转：\u201c踢得好妩媚\u201d。","state":"publish","comments_count":35,"low_url":"http://qiubai-video.qiushibaike.com/DVFN509AM2NUWUV0_3g.mp4","allow_comment":true,"share_count":55,"type":"hot","loop":116464},{"high_url":"http://qiubai-video.qiushibaike.com/MHT7S5WWXNQ02L9K.mp4","format":"video","image":null,"published_at":1475144701,"tag":"null","user":{"avatar_updated_at":1474456170,"uid":32675548,"last_visited_at":1474456169,"created_at":1474456169,"state":"active","last_device":"ios_10.3.12","role":"n","login":"位行搜ye58885","id":32675548,"icon":"201609211909305.GIF"},"image_size":{"s":[480,480,8],"m":[480,480,8]},"id":117640971,"votes":{"down":-54,"up":2164},"created_at":1475139933,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/MHT7S5WWXNQ02L9K.jpg","content":"世界那么大，你们去看看","state":"publish","comments_count":61,"low_url":"http://qiubai-video.qiushibaike.com/MHT7S5WWXNQ02L9K_3g.mp4","allow_comment":true,"share_count":208,"type":"hot","loop":253290},{"high_url":"http://qiubai-video.qiushibaike.com/0S7AX5LU0VDGCH87.mp4","format":"video","image":null,"published_at":1475194801,"tag":"null","user":{"avatar_updated_at":1462254848,"uid":1673960,"last_visited_at":1336288046,"created_at":1336288046,"state":"bonded","last_device":"web","role":"n","login":"紅鯉魚綠鯉魚與驢","id":1673960,"icon":"20160503135406.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117643622,"votes":{"down":-7,"up":59},"created_at":1475163215,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/0S7AX5LU0VDGCH87.jpg","content":"二楼开饭了。","state":"publish","comments_count":4,"low_url":"http://qiubai-video.qiushibaike.com/0S7AX5LU0VDGCH87_3g.mp4","allow_comment":true,"share_count":0,"type":"fresh","loop":4222},{"high_url":"http://qiubai-video.qiushibaike.com/Q0Z9KQLZ46WMXUBE.mp4","format":"video","image":null,"published_at":1475162101,"tag":"null","user":{"avatar_updated_at":1439360423,"uid":4376787,"last_visited_at":1351642841,"created_at":1351642841,"state":"bonded","last_device":"web","role":"n","login":"[赖]","id":4376787,"icon":"20150812142023.jpg"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117642980,"votes":{"down":-61,"up":851},"created_at":1475157913,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/Q0Z9KQLZ46WMXUBE.jpg","content":"经典，我喜欢的一首歌\u2026\u2026","state":"publish","comments_count":43,"low_url":"http://qiubai-video.qiushibaike.com/Q0Z9KQLZ46WMXUBE_3g.mp4","allow_comment":true,"share_count":37,"loop":88370},{"high_url":"http://qiubai-video.qiushibaike.com/4G5XMBP3BX5A06J1.mp4","format":"video","image":null,"published_at":1475162401,"tag":"null","user":{"avatar_updated_at":1473612187,"uid":30534960,"last_visited_at":1446094963,"created_at":1446094963,"state":"active","last_device":"android_8.2.1","role":"n","login":"杨·天下第一帅","id":30534960,"icon":"2016091200430738.JPEG"},"image_size":{"s":[480,480,7],"m":[480,480,7]},"id":117642573,"votes":{"down":-27,"up":306},"created_at":1475154574,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/4G5XMBP3BX5A06J1.jpg","content":"嘿！哥们，鸟飞了～","state":"publish","comments_count":9,"low_url":"http://qiubai-video.qiushibaike.com/4G5XMBP3BX5A06J1_3g.mp4","allow_comment":true,"share_count":23,"loop":48788},{"high_url":"http://qiubai-video.qiushibaike.com/DIVVFZLFX7ESDOUV.mp4","format":"video","image":null,"published_at":1475147702,"tag":"null","user":{"avatar_updated_at":1473223158,"uid":32587496,"last_visited_at":1473223158,"created_at":1473223158,"state":"active","last_device":"android_10.1.3","role":"n","login":"我是僵小鱼","id":32587496,"icon":"2016090712391841.JPEG"},"image_size":{"s":[480,480,15],"m":[480,480,15]},"id":117641482,"votes":{"down":-82,"up":1422},"created_at":1475145598,"pic_size":[480,480],"pic_url":"http://qiubai-video.qiushibaike.com/DIVVFZLFX7ESDOUV.jpg","content":"僵尸是这样喝茶 的吗","state":"publish","comments_count":58,"low_url":"http://qiubai-video.qiushibaike.com/DIVVFZLFX7ESDOUV_3g.mp4","allow_comment":true,"share_count":144,"type":"hot","loop":149815}]
     * total : 1000
     * page : 1
     * refresh : 1000
     */

    private int count;
    private int err;
    private int total;
    private int page;
    private int refresh;
    /**
     * high_url : http://qiubai-video.qiushibaike.com/B02V1XNRKUR3EHNG.mp4
     * format : video
     * image : null
     * published_at : 1475190001
     * tag : null
     * user : {"avatar_updated_at":1439360423,"uid":4376787,"last_visited_at":1351642841,"created_at":1351642841,"state":"bonded","last_device":"web","role":"n","login":"[赖]","id":4376787,"icon":"20150812142023.jpg"}
     * image_size : {"s":[480,480,15],"m":[480,480,15]}
     * id : 117643450
     * votes : {"down":-66,"up":723}
     * created_at : 1475161632
     * pic_size : [480,480]
     * pic_url : http://qiubai-video.qiushibaike.com/B02V1XNRKUR3EHNG.jpg
     * content : 这特么就尴尬了……
     * state : publish
     * comments_count : 62
     * low_url : http://qiubai-video.qiushibaike.com/B02V1XNRKUR3EHNG_3g.mp4
     * allow_comment : true
     * share_count : 834
     * loop : 96293
     */

    private List<ItemsBean> items;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getErr() {
        return err;
    }

    public void setErr(int err) {
        this.err = err;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRefresh() {
        return refresh;
    }

    public void setRefresh(int refresh) {
        this.refresh = refresh;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean implements Serializable{
        private String high_url;
        private String format;
        private Object image;
        private int published_at;
        private String tag;
        /**
         * avatar_updated_at : 1439360423
         * uid : 4376787
         * last_visited_at : 1351642841
         * created_at : 1351642841
         * state : bonded
         * last_device : web
         * role : n
         * login : [赖]
         * id : 4376787
         * icon : 20150812142023.jpg
         */

        private UserBean user;
        private ImageSizeBean image_size;
        private int id;
        /**
         * down : -66
         * up : 723
         */

        private VotesBean votes;
        private int created_at;
        private String pic_url;
        private String content;
        private String state;
        private int comments_count;
        private String low_url;
        private boolean allow_comment;
        private int share_count;
        private int loop;
        private List<Integer> pic_size;

        public String getHigh_url() {
            return high_url;
        }

        public void setHigh_url(String high_url) {
            this.high_url = high_url;
        }

        public String getFormat() {
            return format;
        }

        public void setFormat(String format) {
            this.format = format;
        }

        public Object getImage() {
            return image;
        }

        public void setImage(Object image) {
            this.image = image;
        }

        public int getPublished_at() {
            return published_at;
        }

        public void setPublished_at(int published_at) {
            this.published_at = published_at;
        }

        public String getTag() {
            return tag;
        }

        public void setTag(String tag) {
            this.tag = tag;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public ImageSizeBean getImage_size() {
            return image_size;
        }

        public void setImage_size(ImageSizeBean image_size) {
            this.image_size = image_size;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public VotesBean getVotes() {
            return votes;
        }

        public void setVotes(VotesBean votes) {
            this.votes = votes;
        }

        public int getCreated_at() {
            return created_at;
        }

        public void setCreated_at(int created_at) {
            this.created_at = created_at;
        }

        public String getPic_url() {
            return pic_url;
        }

        public void setPic_url(String pic_url) {
            this.pic_url = pic_url;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public int getComments_count() {
            return comments_count;
        }

        public void setComments_count(int comments_count) {
            this.comments_count = comments_count;
        }

        public String getLow_url() {
            return low_url;
        }

        public void setLow_url(String low_url) {
            this.low_url = low_url;
        }

        public boolean isAllow_comment() {
            return allow_comment;
        }

        public void setAllow_comment(boolean allow_comment) {
            this.allow_comment = allow_comment;
        }

        public int getShare_count() {
            return share_count;
        }

        public void setShare_count(int share_count) {
            this.share_count = share_count;
        }

        public int getLoop() {
            return loop;
        }

        public void setLoop(int loop) {
            this.loop = loop;
        }

        public List<Integer> getPic_size() {
            return pic_size;
        }

        public void setPic_size(List<Integer> pic_size) {
            this.pic_size = pic_size;
        }

        public static class UserBean implements Serializable{
            private int avatar_updated_at;
            private int uid;
            private int last_visited_at;
            private int created_at;
            private String state;
            private String last_device;
            private String role;
            private String login;
            private int id;
            private String icon;

            public int getAvatar_updated_at() {
                return avatar_updated_at;
            }

            public void setAvatar_updated_at(int avatar_updated_at) {
                this.avatar_updated_at = avatar_updated_at;
            }

            public int getUid() {
                return uid;
            }

            public void setUid(int uid) {
                this.uid = uid;
            }

            public int getLast_visited_at() {
                return last_visited_at;
            }

            public void setLast_visited_at(int last_visited_at) {
                this.last_visited_at = last_visited_at;
            }

            public int getCreated_at() {
                return created_at;
            }

            public void setCreated_at(int created_at) {
                this.created_at = created_at;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
            }

            public String getLast_device() {
                return last_device;
            }

            public void setLast_device(String last_device) {
                this.last_device = last_device;
            }

            public String getRole() {
                return role;
            }

            public void setRole(String role) {
                this.role = role;
            }

            public String getLogin() {
                return login;
            }

            public void setLogin(String login) {
                this.login = login;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getIcon() {
                return icon;
            }

            public void setIcon(String icon) {
                this.icon = icon;
            }
        }

        public static class ImageSizeBean implements Serializable{
            private List<Integer> s;
            private List<Integer> m;

            public List<Integer> getS() {
                return s;
            }

            public void setS(List<Integer> s) {
                this.s = s;
            }

            public List<Integer> getM() {
                return m;
            }

            public void setM(List<Integer> m) {
                this.m = m;
            }
        }

        public static class VotesBean implements Serializable{
            private int down;
            private int up;

            public int getDown() {
                return down;
            }

            public void setDown(int down) {
                this.down = down;
            }

            public int getUp() {
                return up;
            }

            public void setUp(int up) {
                this.up = up;
            }
        }
    }
}
