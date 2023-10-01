<%-- 
    Document   : UserLists
    Created on : Sep 18, 2023, 11:54:34 PM
    Author     : Dell
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
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
	<link rel="icon" href="../error-404.html" type="image/x-icon" />
	<link rel="shortcut icon" type="image/x-icon" href="admin/assets/images/favicon.png" />
	
	<!-- PAGE TITLE HERE ============================================= -->
	<title>EduChamp : Education HTML Template </title>
	
	<!-- MOBILE SPECIFIC ============================================= -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	
	<!--[if lt IE 9]>
	<script src="assets/js/html5shiv.min.js"></script>
	<script src="assets/js/respond.min.js"></script>
	<![endif]-->
	
	<!-- All PLUGINS CSS ============================================= -->
	<link rel="stylesheet" type="text/css" href="admin/assets/css/assets.css">
	<link rel="stylesheet" type="text/css" href="admin/assets/vendors/calendar/fullcalendar.css">
	
	<!-- TYPOGRAPHY ============================================= -->
	<link rel="stylesheet" type="text/css" href="admin/assets/css/typography.css">
	
	<!-- SHORTCODES ============================================= -->
	<link rel="stylesheet" type="text/css" href="admin/assets/css/shortcodes/shortcodes.css">
	
	<!-- STYLESHEETS ============================================= -->
	<link rel="stylesheet" type="text/css" href="admin/assets/css/style.css">
	<link rel="stylesheet" type="text/css" href="admin/assets/css/dashboard.css">
	<link class="skin" rel="stylesheet" type="text/css" href="admin/assets/css/color/color-1.css">
    </head>
    <body>
    <jsp:include page="Dashboard_header.jsp"></jsp:include>   
    
    <main class="ttr-wrapper">
        <div class="container-fluid">
                <div class="db-breadcrumb">
                        <h4 class="breadcrumb-title">Dashboard</h4>
                        <ul class="db-breadcrumb-list">
                                <li><a href="#"><i class="fa fa-home"></i>Home</a></li>
                                <li>Dashboard</li>
                        </ul>
                </div>	
        </div>
        
        
        <!-- NEED REPAIR -->
        <div class="container-fluid">
            <table>
                <tr>
                    <td><input type="text" class="form-control" placeholder="Search user by name"></td>
                    <td><button type="button" class="btn btn-block btn-success">Search</button></td>
                    <td>
                        <form>
                            <label for="category">Choose a Category:</label>
                            <select id="category" name="category">
                                <option value="electronics">Electronics</option>
                                <option value="electronics">Electronics</option>
                                <option value="electronics">Electronics</option>
                                <option value="electronics">Electronics</option>
                                <option value="electronics">Electronics</option>
                            </select>
                       </form>
                        <button type="button" class="btn btn-block btn-success">Sort</button>
                    </td>
                    <td><button type="button" class="btn btn-block btn-success">Add</button></td>
                </tr>
            </table>
                
        </div>
            <!-- Main content -->
        <section class="content">
          <div class="row">
            <div class="col-lg-12 m-b30">
              <div class="box">
                <!-- /.box-header -->
                <div class="box-body">
                  <table id="example2" class="table table-bordered table-hover">
                    <thead>
                        <tr>
                            <th>Account ID</th>
                            <th>Username</th>
                            <th>Password</th>
                            <th>Email</th>
                            <th>Status</th>
                            <th>Gender</th>
                            <th>Avatar</th>
                            <th>Full name</th>
                            <th>Date of Birth</th>
                            <th>Address</th>
                            <th>Phone Number</th>
                            <th>Create Date</th>
                            <th>Modify Date</th>
                            <th>Role</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach items = "${listAccount}" var="o" varStatus="status">
                            <tr>
                                <td>${o.account_id}</td>
                                <td>${o.username}</td>
                                <td>${o.email}</td>
                                <td>${o.status}</td>
                                <td>${o.gender}</td>
                                <td>${o.avatar}</td>
                                <td>${o.fullname}</td>
                                <td>${o.DOB}</td>
                                <td>${o.address}</td>
                                <td>${o.phonenumber}</td>
                                <td>${o.createDate}</td>
                                <td>${o.modifyDate}</td>
                                <td>${o.passwordToken}</td>
                                <td>${o.role_id}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                  </table>
                </div>
                <!-- /.box-body -->
              </div>
            </div>
            <!-- /.col -->
          </div>
          <!-- /.row -->
            <div >
                <ul>	
                    <c:forEach begin="1" end="${lastPage}" var="i">
                        <li <c:if test="${i == currentPage}">class="active"</c:if>><a href="userlists?page=${i}">${i}</a></li>
                    </c:forEach>
                </ul>
            </div>
        </section>
        <!-- /.content -->
    </main>
    <!-- External JavaScripts -->
    <script src="admin/assets/js/jquery.min.js"></script>
    <script src="admin/assets/vendors/bootstrap/js/popper.min.js"></script>
    <script src="admin/assets/vendors/bootstrap/js/bootstrap.min.js"></script>
    <script src="admin/assets/vendors/bootstrap-select/bootstrap-select.min.js"></script>
    <script src="admin/assets/vendors/bootstrap-touchspin/jquery.bootstrap-touchspin.js"></script>
    <script src="admin/assets/vendors/magnific-popup/magnific-popup.js"></script>
    <script src="admin/assets/vendors/counter/waypoints-min.js"></script>
    <script src="admin/assets/vendors/counter/counterup.min.js"></script>
    <script src="admin/assets/vendors/imagesloaded/imagesloaded.js"></script>
    <script src="admin/assets/vendors/masonry/masonry.js"></script>
    <script src="admin/assets/vendors/masonry/filter.js"></script>
    <script src="admin/assets/vendors/owl-carousel/owl.carousel.js"></script>
    <script src='admin/assets/vendors/scroll/scrollbar.min.js'></script>
    <script src="admin/assets/js/functions.js"></script>
    <script src="admin/assets/vendors/chart/chart.min.js"></script>
    <script src="admin/assets/js/admin.js"></script>
    <script src='admin/assets/vendors/calendar/moment.min.js'></script>
    <script src='admin/assets/vendors/calendar/fullcalendar.js'></script>

    <!-- <script src='assets/vendors/switcher/switcher.js'></script> -->
    <script>
      $(document).ready(function() {

        $('#calendar').fullCalendar({
          header: {
            left: 'prev,next today',
            center: 'title',
            right: 'month,agendaWeek,agendaDay,listWeek'
          },
          defaultDate: '2019-03-12',
          navLinks: true, // can click day/week names to navigate views

          weekNumbers: true,
          weekNumbersWithinDays: true,
          weekNumberCalculation: 'ISO',

          editable: true,
          eventLimit: true, // allow "more" link when too many events
          events: [
            {
              title: 'All Day Event',
              start: '2019-03-01'
            },
            {
              title: 'Long Event',
              start: '2019-03-07',
              end: '2019-03-10'
            },
            {
              id: 999,
              title: 'Repeating Event',
              start: '2019-03-09T16:00:00'
            },
            {
              id: 999,
              title: 'Repeating Event',
              start: '2019-03-16T16:00:00'
            },
            {
              title: 'Conference',
              start: '2019-03-11',
              end: '2019-03-13'
            },
            {
              title: 'Meeting',
              start: '2019-03-12T10:30:00',
              end: '2019-03-12T12:30:00'
            },
            {
              title: 'Lunch',
              start: '2019-03-12T12:00:00'
            },
            {
              title: 'Meeting',
              start: '2019-03-12T14:30:00'
            },
            {
              title: 'Happy Hour',
              start: '2019-03-12T17:30:00'
            },
            {
              title: 'Dinner',
              start: '2019-03-12T20:00:00'
            },
            {
              title: 'Birthday Party',
              start: '2019-03-13T07:00:00'
            },
            {
              title: 'Click for Google',
              url: 'http://google.com/',
              start: '2019-03-28'
            }
          ]
        });

      });

    </script>
    </body>
</html>
