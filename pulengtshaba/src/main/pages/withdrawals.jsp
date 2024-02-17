<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Withdrawal Notice</title>
</head>
<body>
    <div>
        <h2>
            Log In
        </h2>
        <form action="">
            <input placeholder = "Enter Investor name"
            required type="text" name="Investor_Name"><br>
            <input placeholder = "Enter Investor password"
            required type="text" name="Investor_Password"><br>
            <input type="submit"><br>
        </form>
    </div>
    ${}
    <div>
        <h2>Products</h2>
        <table>
          <thead>
            <tr>
              <th>Product-ID</th>
              <th>Product-Name</th>
              <th>Product-Type</th>
              <th>Current-Balance</th>
            </tr>
          </thead>
          <tbody>
            <c:forEach items="${withdrawals}" var="Products">
                <tr>
                    <td>${Products.Product_ID}</td>
                    <td>${Products.Product_Name}</td>
                    <td>${Products.Product_Type}</td>
                    <td>${Products.Product_Balance}</td>
                </tr>
            </c:forEach>
        </tbody>
        </table>
      </div>

      <div>
        <h2>
            Withdrawal Request
        </h2>
        <form action="">
            <input placeholder = "From Product-ID:"
            required type="text" name="send"><br>
            <input placeholder = "To Product-ID:"
            required type="text" name="receive"><br>
            <input placeholder = "Enter Withdrawal-Amount:"
            required type="text" name="WithdrawalAmount"><br>
            <input type="submit"><br>
        </form>
    </div>

    <div>
      <h2>Withdrawal Notice</h2>
      <table>
        <thead>
          <tr>
            <th>Withdrawal-ID</th>
            <th>Product-Name</th>
            <th>Product-Type</th>
            <th>Available-Balance</th>
            <th>Withdrawal-Amount</th>
            <th>Current-Balance</th>
          </tr>
        </thead>
        
      </table>
    </div>

</body>
</html>