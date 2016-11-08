@Controller
class MyAPP
{
	@RequestMapping("/")
	@ResponseBody
	String getMessage()
	{
		return "<h1>Hello World</h1>"
	}
	
	@RequestMapping("/groovyTest")
	@ResponseBody
	String getMessageTester()
	{
		return "<h1>Hello World - Groovy Tester</h1>"
	}
}