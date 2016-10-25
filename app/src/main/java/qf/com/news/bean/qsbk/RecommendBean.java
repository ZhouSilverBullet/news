package qf.com.news.bean.qsbk;

import java.util.List;

/**
 * Created by zz on 16-10-5.
 */

public class RecommendBean {

    /**
     * count : 12
     * items : [{"content":"还是不憋的慌 还有时间打车呢","parent_id":0,"liked":true,"like_count":0,"at_infos":null,"floor":11,"created_at":1364740818,"id":48603861,"user":{"last_visited_at":1339667194,"created_at":1339667194,"last_device":"android_1.3.2","state":"active","role":"n","login":"昆字请分开念","id":2156197,"icon":"2156197.jpg"}},{"content":"捅楼上菊花","parent_id":0,"liked":true,"like_count":0,"at_infos":null,"floor":10,"created_at":1364737151,"id":48592133,"user":{"last_visited_at":1360037896,"created_at":1360037896,"last_device":"android_2.1.3","state":"bonding","role":"n","login":"煦日中正","id":6474630,"icon":""}},{"content":"嘿咻10楼。","parent_id":0,"liked":true,"like_count":0,"at_infos":null,"floor":9,"created_at":1364731460,"id":48579471,"user":{"last_visited_at":1347127585,"created_at":1347127585,"last_device":"android_2.0.5","state":"bonding","role":"n","login":"活该一辈子光棍","id":3503971,"icon":"20130531103227.jpg"}},{"content":"二楼真傻","parent_id":0,"liked":true,"like_count":0,"at_infos":null,"floor":8,"created_at":1364730308,"id":48576821,"user":{"last_visited_at":1364701416,"created_at":1364701416,"last_device":"android_2.2.1","state":"active","role":"n","login":"一个和尚没水吃","id":8061891,"icon":""}},{"content":"这可以","parent_id":0,"liked":true,"like_count":0,"at_infos":null,"floor":7,"created_at":1364711970,"id":48538167,"user":{"last_visited_at":1359550069,"created_at":1359550069,"last_device":"android_2.1.3","state":"active","role":"n","login":"爱无传达","id":6358069,"icon":"6358069.jpg"}},{"content":"有找附近厕所的软件 很好用","parent_id":0,"liked":true,"like_count":0,"at_infos":null,"floor":6,"created_at":1364705393,"id":48523986,"user":{"last_visited_at":1360688032,"created_at":1360688032,"last_device":"android_2.1.3","state":"active","role":"n","login":"`日`久生情","id":6616747,"icon":"6616747.jpg"}},{"content":"师傅不怕他车遭殃？","parent_id":0,"liked":true,"like_count":0,"at_infos":null,"floor":5,"created_at":1364676502,"id":48471911,"user":{"last_visited_at":1359381119,"created_at":1359381119,"last_device":"android_2.1.3","state":"active","role":"n","login":"糗妹纸糗","id":6310857,"icon":""}},{"content":"我这起步价14了  。。。。叹息","parent_id":0,"liked":true,"like_count":0,"at_infos":null,"floor":4,"created_at":1333158082,"id":6312688,"user":{"last_visited_at":1330932942,"created_at":1330932942,"last_device":"android_1.0.6","state":"active","role":"n","login":"呦。呦。皮卡丘","id":937149,"icon":"20121225222300.jpg"}},{"content":"饿。。。这眼神。。","parent_id":0,"liked":true,"like_count":0,"at_infos":null,"floor":3,"created_at":1333156945,"id":6311881,"user":{"last_visited_at":1329863853,"created_at":1329863853,"last_device":"android_1.0.5","state":"active","role":"n","login":"断罪之翼","id":781835,"icon":""}},{"content":"高....!!","parent_id":0,"liked":true,"like_count":0,"at_infos":null,"floor":2,"created_at":1333156494,"id":6311751,"user":{"last_visited_at":1329291797,"created_at":1329291797,"last_device":"web","state":"bonded","role":"n","login":"CQC_S","id":693964,"icon":"20160608162054.jpg"}},{"content":"摸摸2楼狗，头","parent_id":0,"liked":true,"like_count":0,"at_infos":null,"floor":1,"created_at":1333155162,"id":6311930,"user":{"last_visited_at":1329810218,"created_at":1329810218,"last_device":"ios_1.0.2","state":"bonding","role":"n","login":"liveshare520","id":776100,"icon":"20140811205249.jpg"}}]
     * total : 11
     * page : 1
     * err : 0
     */

    private int count;
    private int total;
    private int page;
    private int err;
    /**
     * content : 还是不憋的慌 还有时间打车呢
     * parent_id : 0
     * liked : true
     * like_count : 0
     * at_infos : null
     * floor : 11
     * created_at : 1364740818
     * id : 48603861
     * user : {"last_visited_at":1339667194,"created_at":1339667194,"last_device":"android_1.3.2","state":"active","role":"n","login":"昆字请分开念","id":2156197,"icon":"2156197.jpg"}
     */

    private List<ItemsBean> items;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
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

    public int getErr() {
        return err;
    }

    public void setErr(int err) {
        this.err = err;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    public static class ItemsBean {
        private String content;
        private int parent_id;
        private boolean liked;
        private int like_count;
        private Object at_infos;
        private int floor;
        private int created_at;
        private int id;
        /**
         * last_visited_at : 1339667194
         * created_at : 1339667194
         * last_device : android_1.3.2
         * state : active
         * role : n
         * login : 昆字请分开念
         * id : 2156197
         * icon : 2156197.jpg
         */

        private UserBean user;

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public int getParent_id() {
            return parent_id;
        }

        public void setParent_id(int parent_id) {
            this.parent_id = parent_id;
        }

        public boolean isLiked() {
            return liked;
        }

        public void setLiked(boolean liked) {
            this.liked = liked;
        }

        public int getLike_count() {
            return like_count;
        }

        public void setLike_count(int like_count) {
            this.like_count = like_count;
        }

        public Object getAt_infos() {
            return at_infos;
        }

        public void setAt_infos(Object at_infos) {
            this.at_infos = at_infos;
        }

        public int getFloor() {
            return floor;
        }

        public void setFloor(int floor) {
            this.floor = floor;
        }

        public int getCreated_at() {
            return created_at;
        }

        public void setCreated_at(int created_at) {
            this.created_at = created_at;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public UserBean getUser() {
            return user;
        }

        public void setUser(UserBean user) {
            this.user = user;
        }

        public static class UserBean {
            private int last_visited_at;
            private int created_at;
            private String last_device;
            private String state;
            private String role;
            private String login;
            private int id;
            private String icon;

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

            public String getLast_device() {
                return last_device;
            }

            public void setLast_device(String last_device) {
                this.last_device = last_device;
            }

            public String getState() {
                return state;
            }

            public void setState(String state) {
                this.state = state;
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
    }
}
