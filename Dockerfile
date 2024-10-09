FROM gradle:8.7.0-jdk21

# Install necessary dependencies
RUN apt-get update && apt-get install -yq make ruby ruby-dev build-essential

# Set up the project directory
WORKDIR /project

# Copy the project files
COPY . .

# Make gradlew executable
RUN chmod +x gradlew

# Install Ruby gems
RUN gem install rspec:3.10.0 aruba:1.1.0

# Create necessary directories
RUN mkdir /project/code