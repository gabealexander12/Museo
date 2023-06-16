FROM openjdk:11
WORKDIR /museo-backend
COPY . /museo-backend
RUN chmod +x gradlew
EXPOSE 8080
CMD ["./gradlew", "bootRun"]

