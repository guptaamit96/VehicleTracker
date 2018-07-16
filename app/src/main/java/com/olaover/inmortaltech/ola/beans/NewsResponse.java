package com.olaover.inmortaltech.ola.beans;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class NewsResponse {

    /**
     * status : ok
     * totalResults : 20
     * articles : [{"source":{"id":"the-times-of-india","name":"The Times of India"},"author":"Muntazir Abbas","title":"Vodafone-Idea merger: No delay from government's side, says Manoj Sinha","description":"The fate of the mega merger hangs in balance as Vodafone India is being asked to clear dues of nearly Rs 4,700 crore  for one-time spectrum charges.","url":"https://economictimes.indiatimes.com/industry/telecom/telecom-news/vodafone-idea-merger-no-delay-from-governments-side-says-manoj-sinha/articleshow/64841585.cms","urlToImage":"https://img.etimg.com/thumb/msid-64841704,width-1070,height-580,imgsize-57040,overlay-economictimes/photo.jpg","publishedAt":"2018-07-03T11:20:00Z"},{"source":{"id":null,"name":"Moneycontrol.com"},"author":null,"title":"US sanctions on Iran: Indian Oil chairman confident about oil supply","description":"IOC chairman Sanjiv Singh is confident that Saudi Arabia can cover for the world\u2019s oil supply shortfall","url":"https://www.moneycontrol.com/news/business/us-sanctions-on-iran-indian-oil-chairman-confident-about-oil-supply-2664351.html","urlToImage":"https://static-news.moneycontrol.com/static-mcnews/2018/03/CRUDE-OIL-770x433.png","publishedAt":"2018-07-03T10:59:00Z"},{"source":{"id":null,"name":"Livemint.com"},"author":"Posted by Nirav Vyas","title":"Closing bell: Sensex, Nifty close higher; Auto, IT, pharma stocks rally","description":"BSE Sensex closed 114.19 points higher at 35,378.60, while the Nifty 50 ended 42.60 points up at 10,699.90. Here are the highlights from the markets","url":"https://www.livemint.com/Money/4kLm9qyMBrz6DumpZuSdeP/Stock-Market-LIVE-Sensex-Nifty-set-for-positive-start.html","urlToImage":"https://www.livemint.com/rf/Image-621x414/LiveMint/Period2/2018/07/04/Photos/Home%20Page/bse6-kj7B--621x414@LiveMint.jpg","publishedAt":"2018-07-03T10:06:02Z"},{"source":{"id":"the-times-of-india","name":"The Times of India"},"author":"Bloomberg","title":"Tata Group mulls folding food businesses into single company","description":"The Mumbai-headquartered group is considering separating the salt and branded lentils businesses of Tata Chemicals Ltd. and folding them into Tata Global Beverages Ltd","url":"https://economictimes.indiatimes.com/industry/cons-products/food/tata-group-mulls-folding-food-businesses-into-single-company/articleshow/64840469.cms","urlToImage":"https://img.etimg.com/thumb/msid-64840571,width-1070,height-580,imgsize-99537,overlay-economictimes/photo.jpg","publishedAt":"2018-07-03T10:01:05Z"},{"source":{"id":"the-times-of-india","name":"The Times of India"},"author":"ET Online","title":"Bitcoin investors, watch out for RBI's July 5 deadline","description":"The RBI in April issued a circular giving a three-month buffer period to entities to end their business relationships. That period will end on July 5.","url":"https://economictimes.indiatimes.com/news/economy/policy/bitcoin-investors-watch-out-for-rbis-july-5-deadline/articleshow/64840136.cms","urlToImage":"https://img.etimg.com/thumb/msid-64840126,width-1070,height-580,imgsize-200463,overlay-etdefence/photo.jpg","publishedAt":"2018-07-03T09:36:35Z"},{"source":{"id":null,"name":"Ndtv.com"},"author":null,"title":"All You Want To Know About Income Tax Return Form 1 Sahaj","description":"The Income Tax Department has made it easy for taxpayers to file income tax returns. It has categorised taxpayers into different groups on the basis of their income and its source.","url":"https://www.ndtv.com/business/income-tax-returns-filing-deadline-july-31-all-you-want-to-know-about-sahaj-1877078","urlToImage":"https://i.ndtvimg.com/i/2017-07/itr-income-tax_650x400_81501481951.jpg","publishedAt":"2018-07-03T09:34:00Z"},{"source":{"id":null,"name":"Ndtv.com"},"author":"","title":"Volkswagen To Make 1-litre TSI Engine In India Soon","description":"Volkswagen will be expanding its engine manufacturing operations and will start making the new 1-litre TSI engine in India. The 1-litre TSI engine will power Volkswagen's upcoming compact SUV and also a range of new vehicles.","url":"https://auto.ndtv.com/news/volkswagen-to-make-1-litre-tsi-engine-in-india-soon-1877082","urlToImage":"https://c.ndtvimg.com/volkswagen-tsi-engine_625x300_1530609569649.jpg","publishedAt":"2018-07-03T09:31:00Z"},{"source":{"id":"the-times-of-india","name":"The Times of India"},"author":"PTI","title":"Vedanta delisting not related to Tuticorin incident: Agarwal","description":"Agarwal said there is no plan \"at this stage\" to further consolidate the subsidiaries under one umbrella.","url":"https://economictimes.indiatimes.com/markets/stocks/news/vedanta-delisting-not-related-to-tuticorin-incident-agarwal/articleshow/64839838.cms","urlToImage":"https://img.etimg.com/thumb/msid-64839834,width-1070,height-580,imgsize-202055,overlay-etmarkets/photo.jpg","publishedAt":"2018-07-03T09:17:00Z"},{"source":{"id":null,"name":"Business-standard.com"},"author":"Press Trust of India","title":"Gold maintains downtrend on weak global cues, muted demand","description":"Gold prices went down by Rs 40 to Rs 31,360 per ten grams driven by a weak trend overseas amid fall in demand from local jewellers.\nSilver followed suit and shed Rs 50 to Rs 40,300 per kg due to reduced offtake by industrial units and coin","url":"https://www.business-standard.com/article/pti-stories/gold-maintains-downtrend-on-weak-global-cues-muted-demand-118070300534_1.html","urlToImage":"https://bsmedia.business-standard.com/include/_mod/site/html5/images/no-meta-preview.jpg","publishedAt":"2018-07-03T09:15:00Z"},{"source":{"id":null,"name":"Ndtv.com"},"author":null,"title":"Jet Airways, AirAisa, Vistara Offer Discount On Flight Tickets. Fares, Routes And Other Details","description":"AirAsia India, Jet Airways and Vistara have come up with a host of offers and are offering discounts on domestic and international flight tickets.","url":"https://www.ndtv.com/business/jet-airways-vs-airaisa-india-vs-vistara-latest-discount-deals-offers-on-domestic-flight-tickets-1877067","urlToImage":"https://c.ndtvimg.com//flight,-aeroplane,-plane,-aviation,-airline_625x300_1529486978481.jpg","publishedAt":"2018-07-03T09:05:02Z"},{"source":{"id":null,"name":"Pardaphash.com"},"author":null,"title":"Key features, specifications of '2018 Volvo XC40'!","description":"Key features, specifications of \u20182018 Volvo XC40\u2019!...","url":"https://pardaphash.com/key-features-specifications-of-2018-volvo-xc40/","urlToImage":"https://ddbh1ocl2v3uh.cloudfront.net/wp-content/uploads/2018/07/Volvo-XC40-car.jpg","publishedAt":"2018-07-03T07:37:25Z"},{"source":{"id":null,"name":"Moneycontrol.com"},"author":null,"title":"Rupee staring at 70/$: Is this 2013 all over again?","description":"We don\u2019t see the current depreciation in rupee as a crisis situation yet and hence comparison with 2013 is totally unwarranted.","url":"https://www.moneycontrol.com/news/business/moneycontrol-research/rupee-staring-at-70-is-this-2013-all-over-again-2663461.html","urlToImage":"https://static-news.moneycontrol.com/static-mcnews/2018/05/Rupee-and-dollar-e1529756430397-770x433.jpg","publishedAt":"2018-07-03T07:07:52Z"},{"source":{"id":"the-times-of-india","name":"The Times of India"},"author":"Prabha Raghavan and Arijit Barman","title":"Fortis fresh binding bids due Tuesday, board sets evaluation terms","description":"Bidders will have to disclose the source of their funds to finance the transaction, including firm commitment letters from lenders and plans for retention of current management and employees.","url":"https://economictimes.indiatimes.com/industry/healthcare/biotech/healthcare/fresh-binding-bids-for-fortis-due-today/articleshow/64834712.cms","urlToImage":"https://img.etimg.com/thumb/msid-64834678,width-1070,height-580,imgsize-154307,overlay-economictimes/photo.jpg","publishedAt":"2018-07-03T06:43:00Z"},{"source":{"id":null,"name":"Financialexpress.com"},"author":"FE Online","title":"Sashakt: Know all about Modi government's latest mission to resolve bad loan problem","description":"With an aim to resolve the problem of stressed assets with public-sector banks, the government has come out with a new plan - Sashakt - that includes the creation of one or more widely held asset management companies for loans above Rs 500 crore.","url":"https://www.financialexpress.com/industry/banking-finance/sashakt-know-all-about-modi-governments-latest-mission-to-resolve-bad-loan-problem/1229295/","urlToImage":"https://images.financialexpress.com/2018/07/rupee-1.jpg","publishedAt":"2018-07-03T05:43:26Z"},{"source":{"id":null,"name":"Business-standard.com"},"author":"Karan Choudhury","title":"This Prime Day sale, Amazon India brings virtual reality to a mall near you","description":"Prime Day this year will also feature over 200 exclusive new product launches from top brands","url":"https://www.business-standard.com/article/companies/shop-in-virtual-reality-amazon-india-s-newest-offering-this-prime-day-sale-118070300233_1.html","urlToImage":"https://bsmedia.business-standard.com/_media/bs/img/article/2018-06/13/full/1528903883-6238.jpg","publishedAt":"2018-07-03T05:06:00Z"},{"source":{"id":"the-times-of-india","name":"The Times of India"},"author":"Reena Zachariah","title":"Sebi orders ICICI MF to return Rs 240 crore invested in I-Sec IPO","description":"Sebi thinks the act of the fund house was not in the best interest of investors.","url":"https://economictimes.indiatimes.com/markets/stocks/news/i-sec-ipo-sebi-asks-icici-pru-mf-to-return-rs-240-cr-of-investors-money-to-schemes/articleshow/64832383.cms","urlToImage":"https://img.etimg.com/thumb/msid-64834672,width-1070,height-580,imgsize-77442,overlay-etmarkets/photo.jpg","publishedAt":"2018-07-03T02:35:00Z"},{"source":{"id":null,"name":"Financialexpress.com"},"author":"Saurabh Kumar","title":"No service charge on e-tickets: IRCTC to get Rs 120 crore from Finance Ministry to make up for loss","description":"In further relief to Indian Railway Catering and Tourism Corporation (IRCTC), the finance ministry has decided to pay Rs 120 crore to the railways arm to offset the losses due to waiver of service charge on tickets booked online through its portal in 2018-19.","url":"https://www.financialexpress.com/infrastructure/railways/e-ticket-service-charge-irctc-to-get-rs-120-crore-in-2018-19/1229108/","urlToImage":"https://images.financialexpress.com/2018/07/rail.jpg","publishedAt":"2018-07-03T00:24:36Z"},{"source":{"id":null,"name":"Autocarindia.com"},"author":null,"title":"Six new Hyundai models by 2020","description":"Apart from the Kona EV, here's what's in store from Hyundai for India in the near future.","url":"https://www.autocarindia.com/car-news/six-new-hyundai-models-by-2020-408869","urlToImage":"http://cdni.autocarindia.com/ExtraImages/20180702103456_Hyundai_SantaFE_New_Autocar.jpg","publishedAt":"2018-07-02T05:10:00Z"},{"source":{"id":null,"name":"Business-standard.com"},"author":"M K Venu and Noor Mohammad | The Wire","title":"LIC-IDBI deal: Premium money of citizens can't be used to fill fiscal gaps","description":"The fact that LIC has gross assets of more than Rs 27 trillion does not give the real picture of its financial health as it has to take care of corresponding liabilities too","url":"https://www.business-standard.com/article/economy-policy/lic-idbi-deal-premium-money-of-citizens-can-t-be-used-to-fill-fiscal-gaps-118070200090_1.html","urlToImage":"https://bsmedia.business-standard.com/_media/bs/img/article/2017-08/23/full/1503512348-5589.jpg","publishedAt":"2018-07-02T02:02:09Z"},{"source":{"id":"the-hindu","name":"The Hindu"},"author":"The Hindu","title":"Fuel fractions: on petrol, diesel prices","description":"Both the Centre and States must bite the bullet to cut taxes on petrol and diesel","url":"https://www.thehindu.com/opinion/editorial/fuel-fractions/article24073684.ece","urlToImage":"https://www.thehindu.com/static/theme/default/base/img/og-image.jpg","publishedAt":"2018-06-03T18:35:17Z"}]
     */

    private String status;
    private int totalResults;
    private List<ArticlesBean> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<ArticlesBean> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticlesBean> articles) {
        this.articles = articles;
    }

    public static class ArticlesBean {
        /**
         * source : {"id":"the-times-of-india","name":"The Times of India"}
         * author : Muntazir Abbas
         * title : Vodafone-Idea merger: No delay from government's side, says Manoj Sinha
         * description : The fate of the mega merger hangs in balance as Vodafone India is being asked to clear dues of nearly Rs 4,700 crore  for one-time spectrum charges.
         * url : https://economictimes.indiatimes.com/industry/telecom/telecom-news/vodafone-idea-merger-no-delay-from-governments-side-says-manoj-sinha/articleshow/64841585.cms
         * urlToImage : https://img.etimg.com/thumb/msid-64841704,width-1070,height-580,imgsize-57040,overlay-economictimes/photo.jpg
         * publishedAt : 2018-07-03T11:20:00Z
         */

        private SourceBean source;
        private String author;
        private String title;
        private String description;
        private String url;
        private String urlToImage;
        private String publishedAt;

        public SourceBean getSource() {
            return source;
        }

        public void setSource(SourceBean source) {
            this.source = source;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getUrlToImage() {
            return urlToImage;
        }

        public void setUrlToImage(String urlToImage) {
            this.urlToImage = urlToImage;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public static class SourceBean {
            /**
             * id : the-times-of-india
             * name : The Times of India
             */

            private String id;
            private String name;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }
}
