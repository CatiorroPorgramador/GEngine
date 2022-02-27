package src.Engine;

public class Vector2
{
	public int x;
	public int y;

	public Vector2()
	{
		this.x = 0;
		this.y = 0;
	}

	public Vector2(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public boolean equals(Vector2 vector)
	{
		return (this.x == vector.x && this.y == vector.y);
	}
}