<%-- 
    Document   : QuizHandle
    Created on : Sep 20, 2023, 2:36:48 PM
    Author     : kimdi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <!-- META ============================================= -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="keywords" content />
        <meta name="author" content />
        <meta name="robots" content />

        <!-- DESCRIPTION -->
        <meta name="description" content="EduChamp : Education HTML Template" />

        <!-- OG -->
        <meta property="og:title" content="EduChamp : Education HTML Template" />
        <meta property="og:description" content="EduChamp : Education HTML Template" />
        <meta property="og:image" content />
        <meta name="format-detection" content="telephone=no">

        <!-- FAVICONS ICON ============================================= -->
        <link rel="icon" href="assets/images/favicon.ico" type="image/x-icon" />
        <link rel="shortcut icon" type="image/x-icon" href="assets/images/favicon.png" />

        <!-- PAGE TITLE HERE ============================================= -->
        <title>EduChamp : Education HTML Template </title>

        <!-- MOBILE SPECIFIC ============================================= -->
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!--[if lt IE 9]>
<script src="assets/js/html5shiv.min.js"></script>
<script src="assets/js/respond.min.js"></script>
<![endif]-->

        <!-- All PLUGINS CSS ============================================= -->
        <link rel="stylesheet" type="text/css" href="assets/css/assets.css">

        <!-- TYPOGRAPHY ============================================= -->
        <link rel="stylesheet" type="text/css" href="assets/css/typography.css">

        <!-- SHORTCODES ============================================= -->
        <link rel="stylesheet" type="text/css"
              href="assets/css/shortcodes/shortcodes.css">

        <!-- STYLESHEETS ============================================= -->
        <link rel="stylesheet" type="text/css" href="assets/css/style.css">
        <link class="skin" rel="stylesheet" type="text/css"
              href="assets/css/color/color-1.css">

    </head>
    <body id="bg">
        <div class="page-wraper">
            <div id="loading-icon-bx"></div>
            <!-- Header Top ==== -->
            <header class="header rs-nav">
                <div class="sticky-header navbar-expand-lg">
                    <div class="menu-bar clearfix">
                        <div class="container clearfix">
                            <!-- Header Logo ==== -->
                            <div class="menu-logo">
                                <a href="index.html"><img src="assets/images/logo.png" alt></a>
                            </div>
                            <!-- Mobile Nav Button ==== -->
                            <button class="navbar-toggler collapsed menuicon justify-content-end"
                                    type="button" data-toggle="collapse" data-target="#menuDropdown"
                                    aria-controls="menuDropdown" aria-expanded="false"
                                    aria-label="Toggle navigation">
                                <span></span>
                                <span></span>
                                <span></span>
                            </button>
                            <!-- Search Box ==== -->
                            <div class="nav-search-bar">
                                <form action="#">
                                    <input name="search" value type="text" class="form-control"
                                           placeholder="Type to search">
                                    <span><i class="ti-search"></i></span>
                                </form>
                                <span id="search-remove"><i class="ti-close"></i></span>
                            </div>
                            <!-- Navigation Menu ==== -->
                            <div class="menu-links navbar-collapse collapse justify-content-start"
                                 id="menuDropdown">
                                <div class="menu-logo">
                                    <a href="index.html"><img src="assets/images/logo.png" alt></a>
                                </div>
                                <ul class="nav navbar-nav quiz-handle-nav">
                                    <h3 class="question-title">Chapter 1</h3>
                                    <div class="counter-container">
                                        <!-- Counter display for quizzes completed -->
                                        <h4>Quiz completed:</h4>
                                        <h4 id="quiz-counter">0</h4>
                                        <h4>/Total</h4>
                                    </div>
                                    <div class="question-timer-container">
                                        <h4>Timer:</h4>
                                        <h4 id="question-timer"></h4>
                                    </div>

                                </ul>
                                <div class="nav-social-link">
                                    <a href="javascript:;"><i class="fa fa-facebook"></i></a>
                                    <a href="javascript:;"><i class="fa fa-google-plus"></i></a>
                                    <a href="javascript:;"><i class="fa fa-linkedin"></i></a>
                                </div>
                            </div>
                            <!-- Navigation Menu END ==== -->
                        </div>
                    </div>
                </div>
            </header>
            <!-- header END ==== -->
            <!-- Quiz nav -->
            <div id="quiz-nav">
                <button id = "quiz-nav-btn-quiz1" onclick="scrollToQuiz(1)">1</button>
                <button id = "quiz-nav-btn-quiz2" onclick="scrollToQuiz(2)">2</button>
                <button id = "quiz-nav-btn-quiz3" onclick="scrollToQuiz(3)">3</button>
                <button id = "quiz-nav-btn-quiz4" onclick="scrollToQuiz(4)">4</button>
                <button id = "quiz-nav-btn-quiz5" onclick="scrollToQuiz(5)">5</button>
                <button id = "quiz-nav-btn-quiz6" onclick="scrollToQuiz(6)">6</button>
                <button id = "quiz-nav-btn-quiz7" onclick="scrollToQuiz(7)">7</button>
                <button id = "quiz-nav-btn-quiz8" onclick="scrollToQuiz(8)">8</button>
                <button id = "quiz-nav-btn-quiz9" onclick="scrollToQuiz(9)">9</button>
                <button id = "quiz-nav-btn-quiz10" onclick="scrollToQuiz(10)">10</button>
                <button id = "quiz-nav-btn-quiz11" onclick="scrollToQuiz(11)">11</button>
                <button id = "quiz-nav-btn-quiz12" onclick="scrollToQuiz(12)">12</button>
                <button id = "quiz-nav-btn-quiz13" onclick="scrollToQuiz(13)">13</button>
                <button id = "quiz-nav-btn-quiz14" onclick="scrollToQuiz(14)">14</button>
                <button id = "quiz-nav-btn-quiz15" onclick="scrollToQuiz(15)">15</button>
                <button id = "quiz-nav-btn-quiz16" onclick="scrollToQuiz(16)">16</button>
                <button id = "quiz-nav-btn-quiz17" onclick="scrollToQuiz(17)">17</button>
                <button id = "quiz-nav-btn-quiz18" onclick="scrollToQuiz(18)">18</button>
                <!-- Add more buttons as needed -->
                \			  </div>
            <!-- Quiz nav END-->
            <!-- Quiz -->
            <div class="page-content bg-white">
                <div class="content-block">
                    <div class="section-area section-sp1">
                        <div class="container">
                            <div class="row">
                                <div class="col-lg-12 col-md-12 col-sm-12">
                                    <div class="row"><h4>Quiz list:</h4></div>
                                    <div class="row">
                                        <div class="col-md-12 col-lg-12 col-sm-12 m-b30">
                                            <div class="cours-bx">
                                                <div id="quiz1">
                                                    <div class="info-bx text-left">
                                                        <h5>Question 1: In Lean software development, how can amplifying learning
                                                            occur?</h5>
                                                        <span>Select all that apply</span>
                                                    </div>
                                                    <div class="cours-more-info">
                                                        <div class="review col-md-12 col-lg-12 col-sm-12">
                                                            <ul class="option">
                                                                <li><input type="checkbox" name="quiz1" id="choice101"
                                                                           onclick="toggleEffect(this, 4)">
                                                                    <label for="choice101"><h5>A. The developers make different solutions, each with the
                                                                            exact same features</h5>
                                                                        </button></label></li>
                                                                <li><input type="checkbox" name="quiz1" id="choice201"
                                                                           onclick="toggleEffect(this, 4)">
                                                                    <label for="choice201"><h5>B. The developers use short iterations</h5></label></li>
                                                                <li><input type="checkbox" name="quiz1" id="choice301"
                                                                           onclick="toggleEffect(this, 4)">
                                                                    <label for="choice301"><h5>C. Paris</h5></label></li>
                                                                <li><input type="checkbox" name="quiz1" id="choice401"
                                                                           onclick="toggleEffect(this, 4)">
                                                                    <label for="choice401"><h5>D. Placebo</h5></label></li>		
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-12 col-lg-12 col-sm-12 m-b30">
                                            <div class="cours-bx">
                                                <div id="quiz2">
                                                    <div class="info-bx text-left">
                                                        <h5>Question 2: In Lean software development, how can amplifying learning
                                                            occur?</h5>
                                                        <span>Select 2 that apply</span>
                                                    </div>
                                                    <div class="cours-more-info">
                                                        <div class="review col-md-12 col-lg-12 col-sm-12">
                                                            <ul class="option">
                                                                <li><input type="checkbox" name="quiz2" id="choice102"
                                                                           onclick="toggleEffect(this, 2)">
                                                                    <label for="choice102"><h5>A. The developers make different solutions, each with the
                                                                            exact same features</h5>
                                                                        </button></label></li>
                                                                <li><input type="checkbox" name="quiz2" id="choice202"
                                                                           onclick="toggleEffect(this, 2)">
                                                                    <label for="choice202"><h5>B. The developers use short iterations</h5></label></li>
                                                                <li><input type="checkbox" name="quiz2" id="choice302"
                                                                           onclick="toggleEffect(this, 2)">
                                                                    <label for="choice302"><h5>C. Paris</h5></label></li>
                                                                <li><input type="checkbox" name="quiz2" id="choice402"
                                                                           onclick="toggleEffect(this, 2)">
                                                                    <label for="choice402"><h5>D. Placebo</h5></label></li>		
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-12 col-lg-12 col-sm-12 m-b30">
                                            <div class="cours-bx">
                                                <div id="quiz3">
                                                    <div class="info-bx text-left">
                                                        <h5>Question 3: In Lean software development, how can amplifying learning
                                                            occur?</h5>
                                                        <span>Select 3 that apply</span>
                                                    </div>
                                                    <div class="cours-more-info">
                                                        <div class="review col-md-12 col-lg-12 col-sm-12">
                                                            <ul class="option">
                                                                <li><input type="checkbox" name="quiz3" id="choice103"
                                                                           onclick="toggleEffect(this, 3)">
                                                                    <label for="choice103"><h5>A. The developers make different solutions, each with the
                                                                            exact same features</h5>
                                                                        </button></label></li>
                                                                <li><input type="checkbox" name="quiz3" id="choice203"
                                                                           onclick="toggleEffect(this, 3)">
                                                                    <label for="choice203"><h5>B. The developers use short iterations</h5></label></li>
                                                                <li><input type="checkbox" name="quiz3" id="choice303"
                                                                           onclick="toggleEffect(this, 3)">
                                                                    <label for="choice303"><h5>C. Paris</h5></label></li>
                                                                <li><input type="checkbox" name="quiz3" id="choice403"
                                                                           onclick="toggleEffect(this, 3)">
                                                                    <label for="choice403"><h5>D. Placebo</h5></label></li>		
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                        <div class="col-md-12 col-lg-12 col-sm-12 m-b30">
                                            <div class="cours-bx">
                                                <div id="quiz4">
                                                    <div class="info-bx text-left">
                                                        <h5>Question 4: In Lean software development, how can amplifying learning
                                                            occur?</h5>
                                                        <span>Select 1 that apply</span>
                                                    </div>
                                                    <div class="cours-more-info">
                                                        <div class="review col-md-12 col-lg-12 col-sm-12">
                                                            <ul class="option">
                                                                <li><input type="checkbox" name="quiz4" id="choice104"
                                                                           onclick="toggleEffect(this, 1)">
                                                                    <label for="choice104"><h5>A. The developers make different solutions, each with the
                                                                            exact same features</h5>
                                                                        </button></label></li>
                                                                <li><input type="checkbox" name="quiz4" id="choice204"
                                                                           onclick="toggleEffect(this, 1)">
                                                                    <label for="choice204"><h5>B. The developers use short iterations</h5></label></li>
                                                                <li><input type="checkbox" name="quiz4" id="choice304"
                                                                           onclick="toggleEffect(this, 1)">
                                                                    <label for="choice304"><h5>C. Paris</h5></label></li>
                                                                <li><input type="checkbox" name="quiz4" id="choice404"
                                                                           onclick="toggleEffect(this, 1)">
                                                                    <label for="choice404"><h5>D. Placebo</h5></label></li>		
                                                            </ul>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Quiz END-->
            <div class="submit-container"><button class="submit-exam"><h4>Submit</h4></button></div>
            <button class="back-to-top fa fa-chevron-up"></button>
        </div>
        <!-- External JavaScripts -->
        <script src="assets/js/jquery.min.js"></script>
        <script src="assets/vendors/bootstrap/js/popper.min.js"></script>
        <script src="assets/vendors/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/vendors/bootstrap-select/bootstrap-select.min.js"></script>
        <script src="assets/vendors/bootstrap-touchspin/jquery.bootstrap-touchspin.js"></script>
        <script src="assets/vendors/magnific-popup/magnific-popup.js"></script>
        <script src="assets/vendors/counter/waypoints-min.js"></script>
        <script src="assets/vendors/counter/counterup.min.js"></script>
        <script src="assets/vendors/imagesloaded/imagesloaded.js"></script>
        <script src="assets/vendors/masonry/masonry.js"></script>
        <script src="assets/vendors/masonry/filter.js"></script>
        <script src="assets/vendors/owl-carousel/owl.carousel.js"></script>
        <script src="assets/js/functions.js"></script>
        <script src="assets/js/contact.js"></script>
        <script src='assets/vendors/switcher/switcher.js'></script>
    </body>

</html>

