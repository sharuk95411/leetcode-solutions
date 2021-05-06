public class Solution {
    public string RemoveDuplicates(string s, int k) {
        Stack<(char c, int frequency)> stack = new Stack<(char, int)>();

		foreach (char c in s)
		{
			if (stack.Count > 0 && stack.Peek().c == c)
			{
				var top = stack.Pop();
				top.frequency++;

				if (top.frequency != k)
				{
					stack.Push(top);
				}
			}
			else
			{
				stack.Push((c, 1));
			}
		}

		StringBuilder result = new StringBuilder();
		var resultList = stack.ToArray().Reverse();
		foreach ((char c, int frequency) in resultList)            
		{
			result.Append(c, frequency);
		}
		return result.ToString();
    }
}
