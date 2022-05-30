package src.Engine;

public class Vector2
{
	public float x;
	public float y;

	// Constructor
	public Vector2()
	{
		this.x = 0;
		this.y = 0;
	}

	public Vector2(float x, float y)
	{
		this.x = x;
		this.y = y;
	}

	// Methods
	public boolean equals(Vector2 vector)
	{
		return (this.x == vector.x && this.y == vector.y);
	}

	public double get_length()
	{
		return Math.sqrt(this.x*this.x + this.y*this.y);
	}

	public void normalize()
	{
		if (this.get_length() != 0.0)
		{
			float s = 1.f / (float) get_length();
			this.x = this.x*s;
			this.y = this.y*s;
		}
	}

	public Vector2 normalized()
	{
		Vector2 vec2_normalized = new Vector2();

		if (vec2_normalized.get_length() != 0.0)
		{
			float s = 1.f / (float) get_length();
			vec2_normalized.x = vec2_normalized.x*s;
			vec2_normalized.y = vec2_normalized.y*s;
		}

		return(vec2_normalized);
	}
} 