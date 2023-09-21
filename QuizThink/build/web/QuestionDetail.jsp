<%-- 
    Document   : QuestionList
    Created on : Sep 20, 2023, 2:49:12 PM
    Author     : kimdi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="Model.Account" %>
<%@ page import="Model.Question" %>
<%@ page import="Model.Subject" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html lang="en">


    <head>

        <!-- META ============================================= -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="keywords" content="" />
        <meta name="author" content="" />
        <meta name="robots" content="" />

        <!-- DESCRIPTION -->
        <meta name="description" content="EduChamp : Education HTML Template" />

        <!-- OG -->
        <meta property="og:title" content="EduChamp : Education HTML Template" />
        <meta property="og:description" content="EduChamp : Education HTML Template" />
        <meta property="og:image" content="" />
        <meta name="format-detection" content="telephone=no">

        <!-- FAVICONS ICON ============================================= -->
        <link rel="icon" href="Front End/assets/images/favicon.ico" type="image/x-icon" />
        <link rel="shortcut icon" type="image/x-icon" href="Front End/assets/images/favicon.png" />

        <!-- PAGE TITLE HERE ============================================= -->
        <title>EduChamp : Education HTML Template </title>

        <!-- MOBILE SPECIFIC ============================================= -->
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!--[if lt IE 9]>
        <script src="Front End/assets/js/html5shiv.min.js"></script>
        <script src="Front End/assets/js/respond.min.js"></script>
        <![endif]-->

        <!-- All PLUGINS CSS ============================================= -->
        <link rel="stylesheet" type="text/css" href="Front End/assets/css/assets.css">

        <!-- TYPOGRAPHY ============================================= -->
        <link rel="stylesheet" type="text/css" href="Front End/assets/css/typography.css">

        <!-- SHORTCODES ============================================= -->
        <link rel="stylesheet" type="text/css" href="Front End/assets/css/shortcodes/shortcodes.css">

        <!-- STYLESHEETS ============================================= -->
        <link rel="stylesheet" type="text/css" href="Front End/assets/css/style.css">
        <link class="skin" rel="stylesheet" type="text/css" href="Front End/assets/css/color/color-1.css">

    </head>
    <body id="bg">
        <div class="page-wraper">
            <div id="loading-icon-bx"></div>

            <!-- Content -->
            <%
                Subject subject = (Subject) request.getAttribute("subject");
            %>
            <div class="page-content bg-white">
                <!-- inner page banner -->
                <div class="page-banner ovbl-dark" style="background-image:url(Front End/assets/images/banner/banner3.jpg);">
                    <div class="container">
                        <div class="page-banner-entry">
                            <h1 class="text-white"><%= subject.getDescription() %></h1>
                        </div>
                    </div>
                </div>
                <!-- Breadcrumb row -->
                <div class="breadcrumb-row">
                    <div class="container">
                        <ul class="list-inline">
                            <li><a href="#">Home</a></li>
                            <li>Science</li>
                            <li>Computer science</li>
                            <li>Software Engineering</li>
                            <li><%= subject.getDescription() %></li>
                        </ul>
                    </div>
                </div>
                <!-- Breadcrumb row END -->
                <!-- inner page banner END -->
                <div class="content-block">
                    <!-- About Us -->
                    <div class="section-area section-sp1">
                        <div class="container">
                            <div class="row">
                                <div class="col-lg-3 col-md-4 col-sm-12 m-b30">
                                    <div class="widget courses-search-bx placeani">
                                        <div class="form-group">
                                            <div class="input-group">
                                                <label>Search Question</label>
                                                <input name="dzName" type="text" required class="form-control">
                                            </div>
                                        </div>
                                    </div>
                                    <div class="widget">
                                        <a href="#"><img src="Front End/assets/images/adv/adv.jpg" alt=""/></a>
                                    </div>
                                    <div class="widget recent-posts-entry widget-courses">
                                        <h5 class="widget-title style-1">Recent Subject</h5>
                                        <div class="widget-post-bx">
                                            <div class="widget-post clearfix">
                                                <div class="ttr-post-media"> <img src="Front End/assets/images/blog/recent-blog/pic1.jpg" width="200" height="143" alt=""> </div>
                                                <div class="ttr-post-info">
                                                    <div class="ttr-post-header">
                                                        <h6 class="post-title"><a href="#">Introduction EduChamp</a></h6>
                                                    </div>
                                                    <div class="ttr-post-meta">
                                                        <ul>
                                                            <li class="review">03 Questions</li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="widget-post clearfix">
                                                <div class="ttr-post-media"> <img src="Front End/assets/images/blog/recent-blog/pic3.jpg" width="200" height="160" alt=""> </div>
                                                <div class="ttr-post-info">
                                                    <div class="ttr-post-header">
                                                        <h6 class="post-title"><a href="#">English For Tommorow</a></h6>
                                                    </div>
                                                    <div class="ttr-post-meta">
                                                        <ul>
                                                            <li class="review">07 Questions</li>
                                                        </ul>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                                <div class="col-lg-9 col-md-8 col-sm-12">
                                    <div class="row"><h4>Question list:</h4></div>
                                    <div class="row">
                                        <!-- Question list display-->
                                        <%
                                        Question question = (Question)request.getAttribute("question");

                                        if (question != null) {
                                                int rate = question.getRate();

                                                // Calculate the number of full stars
                                                int fullStars = rate / 2;

                                                // Calculate the remaining half star
                                                boolean hasHalfStar = rate % 2 == 1;
                                        %>
                                        <div class="col-md-12 col-lg-12 col-sm-12 m-b30">
                                            <div class="cours-bx detail">
                                                <div class="col-md-6 col-lg-6 col-sm-12 info-bx text-left">
                                                    <img src="<%= question.getImageURL() %>" alt="" />
                                                </div>
                                                <div class="col-md-6 col-lg-6 col-sm-12 info-bx text-left d-flex align-items-center flex-column question-navigation">
                                                    <button class="submit-btn detail"><h4>Learn quiz</h4></button>
                                                    <button class="submit-btn detail" onclick="showExamPopup()"><h4>New exam</h4></button>
                                                    <button class="submit-btn detail"><h4>View history</h4></button>
                                                </div>
                                                <!-- The Exam Popup -->
                                                <div id="examPopup" class="exam-popup">
                                                    <div class="exam-popup-content">
                                                        <button class="submit-btn quit" onclick="closeExamPopup()">X</button>
                                                        <h3>Exam Information</h3>
                                                        <h5>Level: <%= question.getLevel() %></h5>
                                                        <h5>Duration: min, hour</h5>
                                                        <h5>50 quiz</h5>
                                                        <!-- Add exam information here -->
                                                        <form action="exam-servlet-url" method="POST">
                                                            <input type="hidden" name="questionId" value="your-questionId-value">
                                                            <button type="submit" class="submit-btn detail">Start Exam</button>
                                                        </form>
                                                    </div>
                                                </div>
                                                <!-- The Exam Popup END-->
                                                <div class="info-bx text-left detail">
                                                    <h5><%= question.getTitle() %></h5>
                                                    <span>Level: <%= question.getLevel() %></span>
                                                    <br>
                                                    <span>Duration: <%= question.getDuration() %></span>
                                                    <br>
                                                    <span>Created Date: <%= question.getCreatedDate() %></span>
                                                    <br>
                                                    <p>Description: <%= question.getDescription() %></p>
                                                </div>
                                                <div class="col-md-12 col-lg-12 col-sm-12 cours-more-info">
                                                    <div class="review">
                                                        <span><%= question.getStatus() %> Review</span>
                                                        <ul class="cours-star">
                                                            <% for (int i = 0; i < fullStars; i++) { %>
                                                            <li class="active">
                                                                <i class="fa fa-star"></i>
                                                            </li>
                                                            <% } %>
                                                            <% if (hasHalfStar) { %>
                                                            <li class="active">
                                                                <i class="fa fa-star-half-o"></i>
                                                            </li>
                                                            <% fullStars++; %>
                                                            <% } %>
                                                            <% for (int i = fullStars; i < 5; i++) { %>
                                                            <li>
                                                                <i class="fa fa-star"></i>
                                                            </li>
                                                            <% } %>
                                                        </ul>
                                                    </div>
                                                    <div class="review">
                                                        <h5>Passed</h5>
                                                        <i class="fa fa-check"></i>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <%
                                            } else {
                                        %>
                                        <p>No questions found.</p>
                                        <%
                                            }
                                        %>
                                        <div class="col-lg-12 m-b20">
                                            <div class="pagination-bx rounded-sm gray clearfix">
                                                <ul class="pagination">
                                                    <li class="previous"><a href="#"><i class="ti-arrow-left"></i> Prev</a></li>
                                                    <li class="active"><a href="#">1</a></li>
                                                    <li><a href="#">2</a></li>
                                                    <li><a href="#">3</a></li>
                                                    <li class="next"><a href="#">Next <i class="ti-arrow-right"></i></a></li>
                                                </ul>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- contact area END -->

            </div>
            <!-- Content END-->
            <button class="back-to-top fa fa-chevron-up" ></button>
        </div>
        <!-- External JavaScripts -->
        <script src="Front End/assets/js/jquery.min.js"></script>
        <script src="Front End/assets/vendors/bootstrap/js/popper.min.js"></script>
        <script src="Front End/assets/vendors/bootstrap/js/bootstrap.min.js"></script>
        <script src="Front End/assets/vendors/bootstrap-select/bootstrap-select.min.js"></script>
        <script src="Front End/assets/vendors/bootstrap-touchspin/jquery.bootstrap-touchspin.js"></script>
        <script src="Front End/assets/vendors/magnific-popup/magnific-popup.js"></script>
        <script src="Front End/assets/vendors/counter/waypoints-min.js"></script>
        <script src="Front End/assets/vendors/counter/counterup.min.js"></script>
        <script src="Front End/assets/vendors/imagesloaded/imagesloaded.js"></script>
        <script src="Front End/assets/vendors/masonry/masonry.js"></script>
        <script src="Front End/assets/vendors/masonry/filter.js"></script>
        <script src="Front End/assets/vendors/owl-carousel/owl.carousel.js"></script>
        <script src="Front End/assets/js/functions.js"></script>
        <script src="Front End/assets/js/contact.js"></script>
        <script src='Front End/assets/vendors/switcher/switcher.js'></script>
    </body>

</html>
