package qf.com.news.bean.news;

import java.util.List;

import qf.com.news.bean.Bean;

/**
 * Created by  javac on 2016/9/29.
 * email:kylin_javac@outlook.com
 * desc:
 */

public class HomeBean implements Bean {

    /**
     * postid : PHOT2361C000157K
     * hasCover : false
     * hasHead : 1
     * replyCount : 7877
     * hasImg : 1
     * digest :
     * hasIcon : true
     * docid : 9IG74V5H00963VRO_C24Q79MLluowenwenupdateDoc
     * title : 历史的对照：不同时代下的亚洲影像
     * order : 1
     * priority : 355
     * lmodify : 2016-09-29 13:49:44
     * boardid : photoview_bbs
     * ads : [{"title":"最低月租三十几元 青岛保障房发放钥匙","tag":"photoset","imgsrc":"http://cms-bucket.nosdn.127.net/396f4d75cf944c24a7cc568941e4a2a220160929094059.jpeg","subtitle":"","url":"00AP0001|2201579"},{"title":"台风\"鲇鱼\"来袭 福建民众坐铲车出行","tag":"photoset","imgsrc":"http://cms-bucket.nosdn.127.net/47d5c72fe72e4daf9ce230a2637a080e20160929091337.jpeg","subtitle":"","url":"00AN0001|2201561"},{"title":"浙江多地爆发洪水及山体滑坡 各界救援","tag":"photoset","imgsrc":"http://cms-bucket.nosdn.127.net/bce911a778114b68876c87f9c042db4d20160929075952.jpeg","subtitle":"","url":"00AN0001|2201516"},{"title":"马航MH17空难调查组公布初步调查结果","tag":"photoset","imgsrc":"http://cms-bucket.nosdn.127.net/20c55c4fee7341858240eacd5d1243e420160929091118.jpeg","subtitle":"","url":"00AO0001|2201559"},{"title":"美国校园发生枪击案 枪手为14岁少年","tag":"photoset","imgsrc":"http://cms-bucket.nosdn.127.net/b54480391e3f4ee79e9329a924bfd51f20160929090920.jpeg","subtitle":"","url":"00AO0001|2201558"}]
     * photosetID : 57KT0001|2201644
     * template : normal1
     * votecount : 7466
     * skipID : 57KT0001|2201644
     * alias : Top News
     * skipType : photoset
     * cid : C1348646712614
     * hasAD : 1
     * imgextra : [{"imgsrc":"http://cms-bucket.nosdn.127.net/3a1fac4506e5432da8711984e0e3742e20160929131550.jpeg"},{"imgsrc":"http://cms-bucket.nosdn.127.net/097af5f04714473e83e58b9955fd85ff20160929131551.jpeg"}]
     * source : 网易原创
     * ename : iosnews
     * imgsrc : http://cms-bucket.nosdn.127.net/1a04394bc0554c08ad03e256c847ddb520160929131548.jpeg
     * tname : 头条
     * ptime : 2016-09-29 13:14:24
     */

    private List<T1348647853363Bean> T1348647853363;

    public List<T1348647853363Bean> getT1348647853363() {
        return T1348647853363;
    }

    public void setT1348647853363(List<T1348647853363Bean> T1348647853363) {
        this.T1348647853363 = T1348647853363;
    }

    public static class T1348647853363Bean {
        private String postid;
        private boolean hasCover;
        private int hasHead;
        private int replyCount;
        private int hasImg;
        private String digest;
        private boolean hasIcon;
        private String docid;
        private String title;
        private int order;
        private int priority;
        private String lmodify;
        private String boardid;
        private String photosetID;
        private String template;
        private int votecount;
        private String skipID;
        private String alias;
        private String skipType;
        private String cid;
        private int hasAD;
        private String source;
        private String ename;
        private String imgsrc;
        private String tname;
        private String ptime;
        private String url_3w;

        public String getUrl_3w() {
            return url_3w;
        }

        public void setUrl_3w(String url_3w) {
            this.url_3w = url_3w;
        }

        /**
         * title : 最低月租三十几元 青岛保障房发放钥匙
         * tag : photoset
         * imgsrc : http://cms-bucket.nosdn.127.net/396f4d75cf944c24a7cc568941e4a2a220160929094059.jpeg
         * subtitle :
         * url : 00AP0001|2201579
         */

        private List<AdsBean> ads;
        /**
         * imgsrc : http://cms-bucket.nosdn.127.net/3a1fac4506e5432da8711984e0e3742e20160929131550.jpeg
         */

        private List<ImgextraBean> imgextra;

        public String getPostid() {
            return postid;
        }

        public void setPostid(String postid) {
            this.postid = postid;
        }

        public boolean isHasCover() {
            return hasCover;
        }

        public void setHasCover(boolean hasCover) {
            this.hasCover = hasCover;
        }

        public int getHasHead() {
            return hasHead;
        }

        public void setHasHead(int hasHead) {
            this.hasHead = hasHead;
        }

        public int getReplyCount() {
            return replyCount;
        }

        public void setReplyCount(int replyCount) {
            this.replyCount = replyCount;
        }

        public int getHasImg() {
            return hasImg;
        }

        public void setHasImg(int hasImg) {
            this.hasImg = hasImg;
        }

        public String getDigest() {
            return digest;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public boolean isHasIcon() {
            return hasIcon;
        }

        public void setHasIcon(boolean hasIcon) {
            this.hasIcon = hasIcon;
        }

        public String getDocid() {
            return docid;
        }

        public void setDocid(String docid) {
            this.docid = docid;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public String getLmodify() {
            return lmodify;
        }

        public void setLmodify(String lmodify) {
            this.lmodify = lmodify;
        }

        public String getBoardid() {
            return boardid;
        }

        public void setBoardid(String boardid) {
            this.boardid = boardid;
        }

        public String getPhotosetID() {
            return photosetID;
        }

        public void setPhotosetID(String photosetID) {
            this.photosetID = photosetID;
        }

        public String getTemplate() {
            return template;
        }

        public void setTemplate(String template) {
            this.template = template;
        }

        public int getVotecount() {
            return votecount;
        }

        public void setVotecount(int votecount) {
            this.votecount = votecount;
        }

        public String getSkipID() {
            return skipID;
        }

        public void setSkipID(String skipID) {
            this.skipID = skipID;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getSkipType() {
            return skipType;
        }

        public void setSkipType(String skipType) {
            this.skipType = skipType;
        }

        public String getCid() {
            return cid;
        }

        public void setCid(String cid) {
            this.cid = cid;
        }

        public int getHasAD() {
            return hasAD;
        }

        public void setHasAD(int hasAD) {
            this.hasAD = hasAD;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public String getEname() {
            return ename;
        }

        public void setEname(String ename) {
            this.ename = ename;
        }

        public String getImgsrc() {
            return imgsrc;
        }

        public void setImgsrc(String imgsrc) {
            this.imgsrc = imgsrc;
        }

        public String getTname() {
            return tname;
        }

        public void setTname(String tname) {
            this.tname = tname;
        }

        public String getPtime() {
            return ptime;
        }

        public void setPtime(String ptime) {
            this.ptime = ptime;
        }

        public List<AdsBean> getAds() {
            return ads;
        }

        public void setAds(List<AdsBean> ads) {
            this.ads = ads;
        }

        public List<ImgextraBean> getImgextra() {
            return imgextra;
        }

        public void setImgextra(List<ImgextraBean> imgextra) {
            this.imgextra = imgextra;
        }

        public static class AdsBean {
            private String title;
            private String tag;
            private String imgsrc;
            private String subtitle;
            private String url;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getTag() {
                return tag;
            }

            public void setTag(String tag) {
                this.tag = tag;
            }

            public String getImgsrc() {
                return imgsrc;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

        public static class ImgextraBean {
            private String imgsrc;

            public String getImgsrc() {
                return imgsrc;
            }

            public void setImgsrc(String imgsrc) {
                this.imgsrc = imgsrc;
            }
        }
    }
}
