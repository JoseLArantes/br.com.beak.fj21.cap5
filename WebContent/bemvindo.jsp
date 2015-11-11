<html>
	<body>
		<%--Comentario JSP --%>
		<%String mensagem = "Mensagem no jsp!"; %>
		<% out.println(mensagem); %>
		<br />
		
		<%String desenvolvido = "Desenvolvido por mim!"; %>
		<%= desenvolvido %>
		<br />
		<%System.out.println("Tudo executou!");%>

	</body>	

</html>