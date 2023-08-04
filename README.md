# DayStarterX API Documentation

The Day Starter API is a versatile tool that allows developers to retrieve a variety of information to help people start their days on a positive and informative note. With a simple set of requests, you can fetch quotes, facts, jokes, interest rates, historical events, weather information, and much more. This README.md provides all the necessary details to get started with the API.

## Base URL

```
https://api.daystarter.com
```

## Authentication

The DayStarter API does not require authentication for accessing public data, such as quotes, jokes, and historical events. However, some endpoints, like interest rates, weather information, or personalized features, may require an API key. To obtain an API key, contact our support team.

## Endpoints

### 1. Get a Quote

Retrieve an inspiring quote to kickstart the day.

- **Endpoint:** `/quote`
- **Method:** `GET`
- **Response:**
  ```json
  {
    "quote": "Success is not final, failure is not fatal: It is the courage to continue that counts. - Winston Churchill"
  }
  ```

### 2. Get a Fun Fact

Fetch a fun and interesting fact to intrigue the mind.

- **Endpoint:** `/fact`
- **Method:** `GET`
- **Response:**
  ```json
  {
    "fact": "A day on Venus is longer than a year on Venus."
  }
  ```

### 3. Get a Joke

Start the day with a good laugh by getting a random joke.

- **Endpoint:** `/joke`
- **Method:** `GET`
- **Response:**
  ```json
  {
    "joke": "Why don't scientists trust atoms? Because they make up everything!"
  }
  ```

### 4. Get Cryptocurrency Prices
Retrieve current cryptocurrency prices for popular cryptocurrencies.

- **Endpoint:** `/crypto-prices`
- **Method**: `GET`
- **Parameters**:
  `cryptocurrency`: The name or symbol of the cryptocurrency (e.g., "BTC", "ETH", "DOGE").
- **Response**:
```json
{
  "cryptocurrency": "BTC",
  "price": 42000.15,
  "currency": "USD",
  "last_updated": "2023-08-04T08:00:00Z"
}
```

### 5. Get World Time
Retrieve the current time and date for a specified location.

- **Endpoint**: `/world-time`
- **Method**: `GET`
- **Parameters**:
  `location`: The name of the city or the time zone identifier (e.g., "New York", "Europe/London").
- **Response**:
```json
{
  "location": "New York",
  "time": "2023-08-04T08:30:00Z"
}
```

### 6. Get Historical Event

Fetch a historical event that occurred on this day in history.

- **Endpoint:** `/historical-event`
- **Method:** `GET`
- **Response:**
  ```json
  {
    "event": "The first commercial electric telegraph line was established in 1844."
  }
  ```

### 6. Get Weather Information

Retrieve weather information for a specified location.

- **Endpoint:** `/weather`
- **Method:** `GET`
- **Parameters:**
  - `location`: The name of the city or the ZIP code.
- **Response:**
  ```json
  {
    "location": "New York",
    "temperature": 25,
    "description": "Partly Cloudy",
    "humidity": 60,
    "wind_speed": 10,
    "wind_direction": "NE"
  }
  ```

## Error Handling

In case of any errors or invalid requests, the API will return appropriate error responses with status codes and messages.

## Rate Limiting

To ensure fair usage of the API, there might be rate-limiting applied to some endpoints. Please check the response headers for rate-limiting information.

## Conclusion

The Good Morning API offers a wide range of delightful and informative content to brighten up the start of each day. Whether you want an inspiring quote, a fascinating fact, a good laugh, or some useful information, this API has got you covered. Feel free to explore the various endpoints and make your mornings more enjoyable and knowledgeable! If you have any questions or need assistance, don't hesitate to contact our support team at support@goodmorningapi.com.

Happy coding and have a great morning! 🌞
